package controller;

import entity.Account;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.Main;
import model.AccountModel;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.List;
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
        try {
            ObservableList<Account> list = FXCollections.observableArrayList();
            AccountModel accountModel = new AccountModel();
            List<Account> accountList = accountModel.read();
            for (Account account : accountList) {
                list.add(account);
                account.updateButton();
            }
            tbView.setItems(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
