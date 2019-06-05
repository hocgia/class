package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;
import model.AccountModel;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {

    public TextField textUsername;
    public PasswordField textPassword;

    public void login() {
        AccountModel accountModel = new AccountModel();
        try {
            if (accountModel.checkLogin(textUsername.getText(), textPassword.getText())) {
                list();
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public void menu() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/menu.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void register() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/register.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void list() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
