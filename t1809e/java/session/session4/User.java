package session4;

public class User {
    private String name;
    private String email;
    private String password;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public void showUser(){
        System.out.println("Name: " + this.name + ". Email: " + this.email + ". Password: " + this.password);
    }
}
