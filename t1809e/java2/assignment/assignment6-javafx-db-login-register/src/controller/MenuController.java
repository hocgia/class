package controller;


import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import main.Main;

import java.io.IOException;

public class MenuController {

    public void login() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
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

    public void exit() {
        Platform.exit();
    }
}
