package entity;

public class Employee {
    private String name;
    private String address;
    private String account;
    private String email;
    private String password;

    public Employee() {
    }

    public Employee(String name, String address, String account, String email, String password) {
        this.name = name;
        this.address = address;
        this.account = account;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
}
