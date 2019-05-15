import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create two objects EmployeeFullTime and EmployeePartime
        EmployeeFullTime fullTime = new EmployeeFullTime();
        EmployeePartime partime = new EmployeePartime();

        //Ask user input baser salary
        System.out.println("Input base salary for employee full time.");
        fullTime.baseSalary = scanner.nextFloat();
        System.out.println("Input base salary for employee part time.");
        partime.baseSalary = scanner.nextFloat();

        //Print salary for each object.
        System.out.println("FullTime Salary: " + fullTime.getSalary());
        System.out.println("Partime Salary: " + partime.getSalary());
    }
}
