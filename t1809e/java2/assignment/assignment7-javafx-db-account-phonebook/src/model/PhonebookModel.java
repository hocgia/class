package model;

import connecter.Connector;
import entity.Phonebook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhonebookModel {

    private Connection connection = new Connector().connector();

    public boolean create(int user_id, String telephone, String status) throws SQLException {
        String sql = "INSERT INTO phonebook (user_id, telephone, status) VALUES ('" + user_id + "', '" + telephone + "', '" + status + "')";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public List<Phonebook> read() throws SQLException {
        List<Phonebook> list = new ArrayList<>();
        String sql = "SELECT * FROM phonebook";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            int userId = resultSet.getInt("user_id");
            String telephone = resultSet.getString("telephone");
            String status = resultSet.getString("status");
            Phonebook phonebook = new Phonebook(id, userId, telephone, status);
            list.add(phonebook);
        }
        return list;
    }

    public boolean update(int id, int userId, String telephone, String status) throws SQLException {
        String sql = "UPDATE phonebook SET user_id = '" + userId + "', telephone = '" + telephone + "', status = '" + status + "' WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM phonebook WHERE id = '" + id + "'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }
}
