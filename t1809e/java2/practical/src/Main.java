import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenrateMenu genrateMenu = new GenrateMenu();
        Controller controller = new Controller();
        while (true){
            genrateMenu.genrateMenu();
            System.out.println("Input your choice.");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Add new contact");
                    controller.add();
                    break;
                case "2":
                    System.out.println("Find a contact by name");
                    controller.find();
                    break;
                case "3":
                    System.out.println("Display contact");
                    controller.display();
                    break;
                case "4":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Choice wrong. Please choice number 1 - 4.");
                    break;
            }
            if (choice.equals("4"))break;
        }
    }
}
