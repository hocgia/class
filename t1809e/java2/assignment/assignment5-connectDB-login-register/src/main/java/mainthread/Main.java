package mainthread;

import controller.Controller;
import until.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        Menu menu = new Menu();
        while (true) {
            menu.generateMenu();
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Đăng nhập.");
                    controller.login();
                    break;
                case "2":
                    System.out.println("Đăng ký.");
                    controller.register();
                    break;
                case "3":
                    System.out.println("Hiển thị danh sách người dùng.");
                    controller.showAccount();
                    break;
                case "4":
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn sai. vui lòng chọn từ 1 -4.");
                    break;
            }
            if(choice.equals("4"))break;
        }
    }
}
