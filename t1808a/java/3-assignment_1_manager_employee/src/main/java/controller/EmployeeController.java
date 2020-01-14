package controller;

import entity.Employee;
import model.EmployeeModel;

import java.util.Scanner;

public class EmployeeController {
    private Scanner scanner = new Scanner(System.in);
    private Employee employee = new Employee();
    private EmployeeModel employeeModel = new EmployeeModel();
    public void register(){
        boolean check = false;
        System.out.println("Nhập thông tin nhân viên.");
        System.out.println("Nhập tên:");
        employee.setName(scanner.nextLine());
        System.out.println("Nhập địa chỉ:");
        employee.setAddress(scanner.nextLine());
        System.out.println("Nhập email:");
        employee.setEmail(scanner.nextLine());
        System.out.println("Nhập account:");
        String account = scanner.nextLine();
        employee.setAccount(account);
        if (employeeModel.checkExistAccount(account)){
            System.out.println("Tên tài khoản đã tồn tại.");
            System.out.println("Đăng ký lại.");
            return;
        }
        System.out.println("Nhập password:");
        employee.setPassword(scanner.nextLine());
        if(check){
            employeeModel.register(employee);
        }
    }

    public void login(){
        System.out.println("Đăng nhập");
        System.out.println("Nhập account:");
        String account = scanner.nextLine();
        System.out.println("Nhập password:");
        String password = scanner.nextLine();
        employee = employeeModel.login(account, password);
        if (employee != null){
            System.out.println("Đăng nhập thành công.");
        }else {
            System.out.println("Đăng nhập thất bại.");
        }
    }
}
