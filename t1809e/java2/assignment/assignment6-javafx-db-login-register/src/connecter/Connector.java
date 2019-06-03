package connecter;

import java.sql.*;

public class Connector {

    private static final String Driver = "com.mysql.jdbc.Driver";

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    private static final String DB_USER = "root";

    private static final String DB_PASSWORD = "";

    private Connection connection;

    public Connector() {
        try {
            Class.forName(Driver);
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkLogin(String username, String password) throws SQLException {
        String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println(resultSet);
        return resultSet.next();
    }

    public ResultSet getQuarry(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public boolean updateQuarry(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(sql)>0;
    }

    public boolean create(String username, String email, String password) throws SQLException {
        String sql = "INSERT INTO user (username, email, password) VALUES ('" + username + "', '" + email + "', '" + password + "')";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        return i > 0;
    }
}
