import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        Menu menu = new Menu();
        while (true){
            menu.generateMenu();
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Add new student.");
                    controller.add();
                    break;
                case "2":
                    System.out.println("Save.");
                    controller.save();
                    break;
                case "3":
                    System.out.println("Display all student.");
                    controller.display();
                    break;
                case "4":
                    System.out.println("Exit.");
                    break;
                default:
                    System.out.println("Wrong choice, please choose a number from 1 - 4.");
                    break;
            }
            if (choice.equals("4")) break;
        }
    }
}
