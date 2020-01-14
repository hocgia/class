package Controller;

import java.util.Scanner;

public class MenuCategory {
    public void createMenuCategory(){
        Scanner scanner = new Scanner(System.in);
        boolean action = true;
        CategoryController categoryController = new CategoryController();
        while (action == true){
            System.out.println("------------ Category------------");
            System.out.println("- 1. Thêm category.");
            System.out.println("- 2. Hiển thị danh sách category.");
            System.out.println("- 3. Sửa category.");
            System.out.println("- 4. Xóa category.");
            System.out.println("- 5. Trở về Menu ch.");
            System.out.println("--------------------------------");
            System.out.println("- Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
//                    System.out.println("Thêm category.");
                    categoryController.addCategory();
                    break;
                case 2:
//                    System.out.println("Hiển thị danh sách category.");
                    categoryController.printCategory();
                    break;
                case 3:
                    System.out.println("Sửa category.");
                    categoryController.editCategory();
                    break;
                case 4:
                    System.out.println("Xóa category.");
                    categoryController.deleteCategory();
                    break;
                case 5:
                    System.out.println("Trở về.");
                    action = false;
                    break;
                default:
                    System.out.println("Lựa chọn sai; chọn số từ 1 đến 5.");
                    break;
            }
        }



    }
}
