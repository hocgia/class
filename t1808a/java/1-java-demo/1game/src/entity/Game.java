package entity;

public class Game {
    private String name;
    private String description;
    private int price;
    private String datesIssue;
    private String homePage;

    public Game() {
    }

    public Game(String name, String description, int price, String datesIssue , String homePage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.datesIssue = datesIssue ;
        this.homePage = homePage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDatesIssue() {
        return datesIssue;
    }

    public void setDatesIssue(String datesIssue) {
        this.datesIssue = datesIssue;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString(){
        return "Name game: " + getName() + " - Description: " + getDescription() + " - Dates Issue: " + getDatesIssue() + " - Home Page: " + getHomePage() + " - Giá: " + getPrice() + "VNĐ";
    }


}
