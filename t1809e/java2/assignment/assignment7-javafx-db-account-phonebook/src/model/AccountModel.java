package model;

import connecter.Connector;
import entity.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountModel {

    private Connection connection = new Connector().connector();

    public boolean create(String username, String email, String password) throws SQLException {
        String sql = "INSERT INTO user (username, email, password) VALUES ('" + username + "', '" + email + "', '" + password + "')";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public List<Account> read() throws SQLException {
        List<Account> list = new ArrayList<>();
        String sql = "SELECT * FROM user";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            Integer id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");
            Account account = new Account(id, username, email, password);
            list.add(account);
        }
        return list;
    }

    public boolean update(int id, String username, String password, String email) throws SQLException {
        String sql = "UPDATE user SET username = '" + username + "', password = '" + password + "', email = '" + email + "' WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM user WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public boolean checkLogin(String username, String password) throws SQLException {
        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println(resultSet.toString());
        return resultSet.next();
    }
}
