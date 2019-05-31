package model;
import java.sql.*;

public class Connector {

    private static final String Driver = "com.mysql.jdbc.Driver";

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    private static final String DB_USER = "root";

    private static final String DB_PASSWORD = "";

    public Connection connection;

    public Connector(){
        try {
            Class.forName(Driver);
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ResultSet getQuerry(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public int updateQuarry(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(sql);
    }
}
