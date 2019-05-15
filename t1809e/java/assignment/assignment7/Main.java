import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenerateMenu generateMenu = new GenerateMenu();
        Controller controller = new Controller();
        while (true) {
            generateMenu.generateMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    controller.addStudent();
                    break;
                case "2":
                    controller.editStudent();
                    break;
                case "3":
                    controller.deleteStudent();
                    break;
                case "4":
                    controller.sortStudentByGpa();
                    break;
                case "5":
                    controller.sortStudentByName();
                    break;
                case "6":
                    controller.showStudent();
                    break;
                case "0":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Choice invalid!");
                    break;
            }
            if (choice.equals("0")) break;
        }
    }
}
