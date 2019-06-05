package controller;

import connecter.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;
import model.AccountModel;

import java.io.IOException;
import java.sql.SQLException;

public class RegisterController {
    public TextField textUsername;
    public TextField textEmail;
    public PasswordField textPassword;
    private AccountModel accountModel = new AccountModel();

    public void register() {
        try {
            String username = textUsername.getText();
            String email = textEmail.getText();
            String password = textPassword.getText();
            if (accountModel.create(username, email, password)) login();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public void menu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/menu.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void login() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
