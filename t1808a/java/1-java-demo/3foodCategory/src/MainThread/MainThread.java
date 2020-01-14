package MainThread;

import Controller.MenuCategory;
import Controller.MenuFood;
import java.util.Scanner;

public class MainThread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuCategory menuCategory = new MenuCategory();
        MenuFood menuFood = new MenuFood();
        boolean action = true;
        while (action == true){
            System.out.println("------------ Menu------------");
            System.out.println("- 1. Category.");
            System.out.println("- 2. Food.");
            System.out.println("- 3. Thoát chương trình");
            System.out.println("-----------------------------");
            System.out.println("- Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Category");
                    menuCategory.createMenuCategory();
                    break;
                case 2:
                    System.out.println("Food");
                    menuFood.createMenuFood();
                    break;
                case 3:
                    System.out.println("Thoát");
                    action = false;
                    break;
                default:
                    System.out.println("Lựa chọn sai chọn số từ 1 đến 3.");
                    break;
            }
        }
    }
}
