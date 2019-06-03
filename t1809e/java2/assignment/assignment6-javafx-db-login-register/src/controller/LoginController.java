package controller;

import com.mysql.jdbc.Connection;
import connecter.Connector;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginController {

    public TextField textUsername;
    public PasswordField textPassword;

    public void login() {
        Connector connector = new Connector();
        try {
            boolean check =connector.checkLogin(textUsername.getText(), textPassword.getText());
            if (check){
                System.out.println(1);
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
