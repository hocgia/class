package Entity;

public class Food {
    private String id;
    private String name;
    private String description;
    private int price;
    private String createAt;

    public Food() {
    }

    public Food(String id, String name, String description, int price, String createAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String toString(){
        return String.format("%15s | %15s | %15s | %15d | %15s", getId(), getName(), getDescription(), getPrice(), getCreateAt());
    }
}
