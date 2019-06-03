package controller;

import connecter.Connector;
import entity.Account;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.Main;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    public TableView<Account> tbView;
    public TableColumn<Account, Integer> colId;
    public TableColumn<Account, String> colUsername;
    public TableColumn<Account, String> colEmail;
    public TableColumn<Account, String> colPassword;
    public TableColumn<Button, Button> colEdit;

    public void menu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/menu.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colEdit.setCellValueFactory(new PropertyValueFactory<>("edit"));
        String sql = "SELECT * FROM user";
        Connector connector = new Connector();
        try {
            ResultSet resultSet = connector.getQuarry(sql);
            ObservableList<Account> list = FXCollections.observableArrayList();
            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                Account account = new Account(id, username, email, password);
                list.add(account);
                account.updateButton();
            }
            tbView.setItems(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
