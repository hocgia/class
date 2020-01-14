package Controller;

import Entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController extends Food {
    private static ArrayList<Food> foodList = new ArrayList<>();

    public void addFood(){
        Scanner scanner = new Scanner(System.in);
        CategoryController categoryController = new CategoryController();
        boolean check = categoryController.checkCategory();
        if (check){
            System.out.println("Nhập vào thông tin món ăn:");
            System.out.println("Mã:");
            String ma = scanner.nextLine();
            System.out.println("Nhập category:");
            String categoryId = categoryController.renderCategory();
            System.out.println("Tên:");
            String ten = scanner.nextLine();
            System.out.println("Mô tả ngắn:");
            String moTaNgan= scanner.nextLine();
            System.out.println("Giá:");
            int gia = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ngày tạo:");
            String ngayTao = scanner.nextLine();
            Food newFood = new Food(ma, categoryId, ten, moTaNgan, gia, ngayTao);
            foodList.add(newFood);
        }{
            System.out.println("Cần thêm category vào trước khi thêm món ăn!");
        }
    }

    public void printList(){
        if(foodList == null || foodList.size() == 0){
            System.out.println("Hiện tại không có món ăn nào!");
            return ;
        }
        CategoryController categoryController = new CategoryController();
        System.out.printf("%15s | %15s | %15s | %15s | %15s | %15s\n", "Mã", "Category", "Tên", "Mô tả ngắn", "Gia" ,"Ngày tạo");
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            String categoryName = categoryController.findCategory(food.getCategoryId());
            System.out.printf("%15s | %15s | %15s | %15s | %15s | %15s\n", food.getFoodId(), categoryName, food.getFoodName(), food.getFoodDescription(), food.getFoodPrice(), food.getFoodCreateAt());
        }
    }
}
