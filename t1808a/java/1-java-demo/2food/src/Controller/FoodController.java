package Controller;

import Entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> foodList = new ArrayList<>();

    public FoodController() {
    }

    public void addFood(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin món ăn:");
        System.out.println("Mã:");
        String ma = scanner.nextLine();
        System.out.println("Tên:");
        String ten = scanner.nextLine();
        System.out.println("Mô tả ngắn:");
        String moTaNgan= scanner.nextLine();
        System.out.println("Giá:");
        int gia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ngày tạo:");
        String ngayTao = scanner.nextLine();
        Food newFood = new Food(ma, ten, moTaNgan, gia, ngayTao);
        foodList.add(newFood);
    }

    public void printList(){
        if(foodList == null || foodList.size() == 0){
            System.out.println("Hiện tại không có món ăn nào!");
            return ;
        }
        System.out.printf("%15s | %15s | %15s | %15s | %15s\n", "Mã", "Tên", "Mô tả ngắn", "Gia" ,"Ngày tạo");
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println(food);
        }
    }
}
