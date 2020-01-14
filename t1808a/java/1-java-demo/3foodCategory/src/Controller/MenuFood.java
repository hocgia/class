package Controller;

import java.util.Scanner;

public class MenuFood {
    public void createMenuFood(){
        Scanner scanner = new Scanner(System.in);
        FoodController foodController = new FoodController();
        MenuFood menuFood = new MenuFood();
        boolean action = true;
        while (action == true){
            System.out.println("------------ Foodydi------------");
            System.out.println("- 1. Thêm món ăn.");
            System.out.println("- 2. Hiển thị danh sách món ăn.");
            System.out.println("- 3. Trở về Menu chính.");
            System.out.println("--------------------------------");
            System.out.println("- Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
//                    System.out.println("Thêm món ăn.");
                    foodController.addFood();
                    break;
                case 2:
//                    System.out.println("In danh sách món ăn");
                    foodController.printList();
                    break;
                case 3:
                    System.out.println("Trở về Menu chính.");
                    action = false;
                    break;
                default:
                    System.out.println("Lựa chọn sai chọn số từ 1 đến 3.");
                    break;
            }
        }
    }
}
