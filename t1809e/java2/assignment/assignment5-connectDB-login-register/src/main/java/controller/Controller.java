package controller;

import entity.Account;
import model.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private Scanner scanner = new Scanner(System.in);

    private Model model = new Model();

    public void login(){
        System.out.println("Nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Nhập password: ");
        String password = scanner.nextLine();
        if(!model.checkLogin(username, password)){
            System.out.println("Sai username hoặc mật khẩu.");
        }else System.out.println("Đăng nhập thành công.");
    }

    public void register(){
        String email, username;
        System.out.println("Nhập username: ");
        while (true){
            username = scanner.nextLine();
            if(model.checkUsername(username)){
                System.out.println("Username đã tồn tại vui lòng chọn Username khác.");
            } else break;
        }
        System.out.println("Nhập email: ");
        while (true){
            email = scanner.nextLine();
            if(model.checkEmail(email)){
                System.out.println("Email đã tồn tại vui lòng chọn email khác.");
            } else break;
        }
        System.out.println("Nhập password: ");
        String password = scanner.nextLine();
        Account account = new Account(username, email, password);
        if(model.createAccount(account)){
            System.out.println("Tạo thành công.");
        } else {
            System.out.println("Lỗi khi lưu.");
        }
    }

    public void showAccount(){
        List<Account> accountList = model.getAll();
        if (accountList.size() != 0 ){
            System.out.printf("%5s|%15s|%20s|%15s\n", "Id", "Username", "Email", "Password");
            for (Account account: accountList) {
                System.out.printf("%5d|%15s|%20s|%15s\n", account.getId(), account.getUsername(), account.getEmail(), account.getPassword());
            }
        } else {
            System.out.println("*** Danh sách trống ***");
        }
    }
}
