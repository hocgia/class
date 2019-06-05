package model;

import entity.Phonebook;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SingletonModel {
    private SingletonModel() {

    }

    public static List<Phonebook> findTelephone(String username) throws SQLException {
        Quarry quarry = new Quarry();
        String sql = "SELECT * FROM user WHERE username = " + username;
        ResultSet resultSetUser = quarry.getQuarry(sql);
        int id = resultSetUser.getInt("id");
        sql = "SELECT * FROM telephone WHERE user_id = " + id;
        ResultSet resultSetTelephone = quarry.getQuarry(sql);
        List<Phonebook> phonebookList = new ArrayList<>();
        while (resultSetTelephone.next()){
            int idTelephone = resultSetTelephone.getInt("id");
            int idUser = resultSetTelephone.getInt("user_id");
            String telephone = resultSetTelephone.getString("telephone");
            String status = resultSetTelephone.getString("status");
            phonebookList.add(new Phonebook(idTelephone, idUser, telephone, status));
        }
        return phonebookList;
    }
}
