import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String dateOfBirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Input information.");
        System.out.println("Name: ");
        setName(scanner.nextLine());
        System.out.println("Gender: ");
        setGender(scanner.nextLine());
        System.out.println("Enter date of birth in the format 'dd/MM/yyyy': ");
        while (true) {
            try {
                String s = scanner.nextLine();
                format.parse(s);
                setDateOfBirth(s);
                break;
            } catch (ParseException e) {
                System.err.println("Sorry, that's not valid. Please try again.");
            }
        }
        System.out.println("Address: ");
        setAddress(scanner.nextLine());
    }

    public void showInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Date of birth: " + getDateOfBirth());
        System.out.println("Address: " + getAddress());
    }
}
