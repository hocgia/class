package connecter;

import java.sql.*;

public class Connector {

    private static final String Driver = "com.mysql.jdbc.Driver";

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";

    private static final String DB_USER = "root";

    private static final String DB_PASSWORD = "";

    private Connection connection;

    public Connection connector() {
        try {
            Class.forName(Driver);
            this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
