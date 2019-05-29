import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private List<Student> students = new ArrayList<>();
    private String path = "src/students.bat";
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Input EnrolId");
        String enrolId = scanner.nextLine();
        System.out.println("Input FirstName");
        String firstName = scanner.nextLine();
        System.out.println("Input LastName");
        String lastName = scanner.nextLine();
        System.out.println("Input Age");
        int age = scanner.nextInt();
        scanner.nextLine();
        students.add(new Student(enrolId, firstName, lastName, age));
    }

    public void save() {
        try {
            FileWriter fileWriter = new FileWriter(this.path);
            for (Student student : students) {
                fileWriter.write(student.getEnrolId() + "@" + student.getFirstName() + "@" + student.getLastName() + "@" + student.getAge());
                fileWriter.write('\n');
            }
            System.out.println("Save success.");
            fileWriter.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public void display() {
        try {
            FileReader fileReader = new FileReader(this.path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.printf("%20s|%20s|%20s\n", "EnrolId", "FullName", "Age");
            System.out.printf("-------------------- ");
            System.out.printf("-------------------- ");
            System.out.printf("-------------------- \n");
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.trim().split("@");
                System.out.printf("%20s|%20s|%20s\n", strings[0], strings[1] + " " + strings[2], strings[3]);
            }
            System.out.printf("-------------------- ");
            System.out.printf("-------------------- ");
            System.out.printf("-------------------- \n");
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}

