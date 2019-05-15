import java.util.*;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    private int findById(String id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getId().equals(id)) return i;
        }
        return -1;
    }

    private Student inputStudent(){
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        while (true) {
            if (findById(id) < 0) {
                break;
            } else {
                System.err.println("Err: Id already exists!");
            }
            id = scanner.nextLine();
        }
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age;
        while (true) {
            try {
                age = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.err.println("Err: input invalid.");
            }
        }
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter gpa: ");
        float gpa;
        while (true) {
            try {
                gpa = scanner.nextFloat();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.err.println("Err: input invalid.");
            }
        }
        return new Student(id, name, age, address, gpa);
    }

    public void addStudent() {
        System.out.println("------ ADD STUDENT ------");
        Student student = inputStudent();
        System.out.println("------------------------");
        if (studentArrayList.add(student)) {
            System.out.println("Add success!");
        } else {
            System.err.println("Add error! Please try again.");
        }
        System.out.println("------------------------");
    }

    public void editStudent() {
        System.out.println("------ EDIT STUDENT ------");
        System.out.println("Input student id");
        String id = scanner.nextLine();
        int result = findById(id);
        if (result==-1){
            System.err.println("Err: Student id not found!");
        }else {
            Student student = inputStudent();
            System.out.println("--------------------------");
            studentArrayList.add(result, student);
            System.out.println("------------------------");
        }
    }

    public void deleteStudent() {
        System.out.println("------ DELETE STUDENT ------");
        System.out.println("Input student id");
        String id = scanner.nextLine();
        int result = findById(id);
        if (result==-1){
            System.err.println("Err: Student id not found!");
        }else {
            Student student = studentArrayList.get(result);
            System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
            System.out.println("Delete (Y/N)");
            String choice = scanner.nextLine();
            while (true) {
                if (choice.equalsIgnoreCase("y")){
                    studentArrayList.remove(result);
                    break;
                } else if (choice.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.err.println("Err: Please choice Y/N!");
                }
            }
        }
        System.out.println("------------------------");
    }

    public void sortStudentByGpa() {
        studentArrayList.sort((o1, o2) -> {
            return (int) (o1.getGpa() - o2.getGpa());
        });

        System.out.println("- SHOW STUDENT SORT BY GPA -\n");
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
        for (Student student : studentArrayList) {
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        }
        System.out.println("------------------------");
    }

    public void sortStudentByName() {
        studentArrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("- SHOW STUDENT SORT BY NAME -\n");
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
        for (Student student : studentArrayList) {
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        }
        System.out.println("------------------------");
    }

    public void showStudent() {
        System.out.println("----- SHOW STUDENT ------\n");
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
        for (Student student : studentArrayList) {
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        }
        System.out.println("------------------------");
    }
}
