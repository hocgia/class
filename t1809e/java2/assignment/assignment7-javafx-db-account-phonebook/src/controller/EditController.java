package controller;

import entity.Account;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;
import model.AccountModel;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EditController implements Initializable {
    public TextField textUsername;
    public TextField textEmail;
    public PasswordField textPassword;

    public static Account editAccount;

    public void menu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/menu.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        textUsername.setText(editAccount.getUsername());
        textEmail.setText(editAccount.getEmail());
        textPassword.setText(editAccount.getPassword());
    }

    public void save() {
        try {
            AccountModel accountModel = new AccountModel();
            String username = textUsername.getText();
            String email = textEmail.getText();
            String password = textPassword.getText();
            if (accountModel.update(editAccount.getId(), username, password, email)) list();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public void list() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
