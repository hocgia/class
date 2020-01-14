package model;

import entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeModel {
    private Connection connection;
    private Employee employee = new Employee();

    private void initConnection(){
        {
            try {
                if(connection == null || connection.isClosed()){
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/human_resource?user=root&password=");
                }
            } catch (Exception ex) {
                System.err.println("Có lỗi xảy ra vui lòng thử lại sau. Error: " + ex.getMessage());
            }
        }
    }

    public boolean register(Employee employee){
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employees (name,address,email,account,password) values (?,?,?,?,?)");
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getAddress());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setString(4, employee.getAccount());
            preparedStatement.setString(5, employee.getPassword());
            preparedStatement.execute();
            return true;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra vui lòng thử lại sau. Error: " + ex.getMessage());
        }
        return false;
    }

    public boolean checkExistAccount(String account){
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into employees where accont = ?");
            preparedStatement.setString(1, account);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            return false;
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra vui lòng thử lại sau. Error: " + ex.getMessage());
        }
        return false;
    }

    public Employee login(String account, String password){
        Employee emp = new Employee();
        try {
            initConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employee where account = ? and password = ?");
            preparedStatement.setString(1, account);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                emp.setName(resultSet.getString("name"));
                emp.setAddress(resultSet.getString("address"));
                emp.setEmail(resultSet.getString("email"));
                emp.setAccount(resultSet.getString("account"));
                emp.setPassword(resultSet.getString("password"));
                resultSet.getString("createAt");
                resultSet.getString("updateAt");
                resultSet.getString("status");
                return emp;
            }
        }catch (Exception ex){
            System.err.println("Có lỗi xảy ra vui lòng thử lại sau. Error: " + ex.getMessage());
        }
        return null;
    }
}
