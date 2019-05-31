package model;

import entity.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Model {

    private Connector connector = new Connector();

    public boolean createAccount(Account account) {
        String sql = "INSERT INTO user (username, email, password) VALUES ('" + account.getUsername() + "', '" + account.getEmail() + "', '" + account.getPassword() + "')";
        try {
            return connector.updateQuarry(sql) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Account> getAll() {
        List<Account> accountList = new ArrayList<>();
        String sql = "SELECT * FROM user";
        try {
            ResultSet resultSet = connector.getQuerry(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                accountList.add(new Account(id, username, email, password));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accountList;
    }

    public boolean checkEmail(String email) {
        String sql = "SELECT * FROM user WHERE email = '" + email + "'";
        try {
            ResultSet resultSet = connector.getQuerry(sql);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkUsername(String username) {
        String sql = "SELECT * FROM user WHERE username = '" + username + "'";
        try {
            ResultSet resultSet = connector.getQuerry(sql);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public boolean checkLogin(String username, String password) {
        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
        try {
            ResultSet resultSet = connector.getQuerry(sql);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
