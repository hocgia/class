package controller;

import connecter.Connector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;

import java.io.IOException;
import java.sql.SQLException;

public class RegisterController {
    public TextField textUsername;
    public TextField textEmail;
    public PasswordField textPassword;

    public void register() {
        try {
            String username = textUsername.getText();
            String email = textEmail.getText();
            String password = textPassword.getText();
            String sql = "INSERT INTO user (username, email, password) VALUES ('" + username + "', '" + email + "', '" + password + "')";
            Connector connector = new Connector();
            if (connector.updateQuarry(sql)) login();
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
