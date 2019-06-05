package entity;

import controller.EditController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import main.Main;

public class Account {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Button edit;

    public Account() {
    }

    public Account(Integer id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.edit = new Button("Edit");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public void updateButton(){
        this.edit.setOnAction(event -> {
            EditController.editAccount = this;
            try{
                goToEdit();
            }catch (Exception e){e.printStackTrace();}

        });
    }

    public void goToEdit() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/edit.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
