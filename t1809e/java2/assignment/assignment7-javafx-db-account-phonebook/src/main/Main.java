package main;


import entity.Account;
import entity.Phonebook;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.PhonebookModel;
import model.SingletonModel;

import java.sql.SQLException;
import java.util.List;

public class Main extends Application {

    public static Stage MainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../view/menu.fxml"));
        primaryStage.setTitle("Manager User ");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

//    public static void main(String[] args) {
//        PhonebookModel phonebookModel = new PhonebookModel();
//
//        try {
//            phonebookModel.create(6, "6666", "1");
//            phonebookModel.update(2, 3, "3333333", "2");
//            List<Phonebook> phonebookList = phonebookModel.read();
//            for (Phonebook phonebook : phonebookList) {
//                System.out.println(phonebook.getTelephone());
//            }
//            phonebookModel.delete(2);
//
//            List<Phonebook> accountList = SingletonModel.findTelephone("trung9");
//            for (Phonebook phonebook : accountList
//            ) {
//                System.out.println(phonebook.getTelephone());
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
