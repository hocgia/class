package controller;

import connecter.Connector;
import entity.Account;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.Main;

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

    public void save(ActionEvent actionEvent) {
        try {
            String username = textUsername.getText();
            String email = textEmail.getText();
            String password = textPassword.getText();
            String sql = "UPDATE user SET username = '" + username + "', password = '" + password + "', email = '" + email + "' WHERE username = '" + editAccount.getUsername() + "'";
            Connector connector = new Connector();
            if (connector.updateQuarry(sql)) list();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }

    }

    public void list() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
