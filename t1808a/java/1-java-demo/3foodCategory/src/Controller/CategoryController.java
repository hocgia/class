package Controller;

import Entity.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryController {
    private static ArrayList<Category> categoryList = new ArrayList<>();

    public void addCategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin category:");
        System.out.println("Mã: ");
        String categoryId = scanner.nextLine();
        System.out.println("Tên: ");
        String categoryName = scanner.nextLine();
        System.out.println("Mô tả ngắn: ");
        String categoryDescription= scanner.nextLine();
        System.out.println("Ngày tạo: ");
        String categoryCreateAt = scanner.nextLine();
        Category newCategory = new Category(categoryId, categoryName, categoryDescription, categoryCreateAt);
        categoryList.add(newCategory);
    }

    public void printCategory(){
        CategoryController categoryController = new CategoryController();
        boolean check = categoryController.checkCategory();
        if(check){
            System.out.printf("%15s | %15s | %15s | %15s \n", "Mã", "Tên", "Mô tả ngắn", "Ngày tạo");
            for (Category category: categoryList) {
                System.out.println(category);
            }
        }
    }

    public void editCategory(){
        CategoryController categoryController = new CategoryController();
        boolean check = categoryController.checkCategory();
        if(check){
            Scanner scanner = new Scanner(System.in);
            boolean find = false;
            System.out.println("Nhập mã category muốn sửa.");
            String idSearch = scanner.nextLine();
            for (int i = 0; i < categoryList.size(); i++) {
                Category category = categoryList.get(i);
                if (idSearch.equals(category.getCategoryId())){
                    find = true;
                    System.out.println("Tìm thấy thông tin category mã: " + idSearch);
                    System.out.printf("%15s | %15s | %15s | %15s \n", "Mã", "Tên", "Mô tả ngắn", "Ngày tạo");
                    System.out.println(category);
                    System.out.println("Bạn có muốn sửa? y/n");
                    String chose = scanner.nextLine();
                    if(chose.equals("y")){
                        System.out.println("Cập nhật thông tin category:");
                        System.out.println("Mã mới: ");
                        String categoryId = scanner.nextLine();
                        System.out.println("Tên mới: ");
                        String categoryName = scanner.nextLine();
                        System.out.println("Mô tả ngắn mới: ");
                        String categoryDescription= scanner.nextLine();
                        System.out.println("Ngày tạo mới: ");
                        String categoryCreateAt = scanner.nextLine();
                        Category updateCategory = new Category(categoryId, categoryName, categoryDescription, categoryCreateAt);
                        categoryList.set(i, updateCategory);
                    }else {
                        System.out.println("Không sửa");
                    }
                    if(find == false){
                        System.out.println("Không tìm thấy!");
                    }
                }
            }
        }
    }

    public void deleteCategory(){
        CategoryController categoryController = new CategoryController();
        boolean check = categoryController.checkCategory();
        if(check){
            Scanner scanner = new Scanner(System.in);
            boolean find = false;
            System.out.println("Nhập mã category muốn xóa.");
            String searchId = scanner.nextLine();
            for (int i = 0; i < categoryList.size(); i++) {
                Category category = categoryList.get(i);
                if (searchId.equals(category.getCategoryId())){
                    find = true;
                    System.out.println("Tìm thấy thông tin category mã: " + searchId);
                    System.out.printf("%15s | %15s | %15s | %15s \n", "Mã", "Tên", "Mô tả ngắn", "Ngày tạo");
                    System.out.println(category);
                    System.out.println("Bạn có muốn xóa? y/n");
                    String chose = scanner.nextLine();
                    if(chose.equals("y")){
                        categoryList.remove(i);
                        System.out.println("Đã xóa");
                    }else {
                        System.out.println("Không xóa.");
                    }
                }
            }
              if(find == false){
                  System.out.println("Không tìm thấy!");
              }
        }
    }

    public String renderCategory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Danh sách category----------");
        for (int i = 0; i < categoryList.size(); i++) {
            Category category = categoryList.get(i);
            System.out.printf("- %d: %s.\n", (i + 1), category.getCategoryName());
        }
        System.out.println("--------------------------------");
        System.out.println("- Nhập lựa chọn của bạn:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        Category category = categoryList.get(choice -1);
        return category.getCategoryId();
    }

    public String findCategory(String categoryId){
        String categoryName = "";
        for (int i = 0; i < categoryList.size(); i++) {
            Category category = categoryList.get(i);
            if (categoryId.equals(category.getCategoryId())){
                categoryName = category.getCategoryName();
                return categoryName;
            }
        }
        return categoryName;
    }

    public boolean checkCategory(){
        if(categoryList == null || categoryList.size() == 0){
            System.out.println("*** Hiện tại không có category nào! ***");
            return false;
        }else {
            return true;
        }
    }
}
