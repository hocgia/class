package model;

import connecter.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Quarry {

    private Connection connection = new Connector().connector();

    public ResultSet getQuarry(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(sql);
    }

    public boolean updateQuarry(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeUpdate(sql)>0;
    }
}
