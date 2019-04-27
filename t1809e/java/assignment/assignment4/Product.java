package assignment4;

public class Product {
    private String id;
    private String productName;
    private int quantity;
    private int price;

    public Product() {
    }

    public Product(String id, String productName, int quantity, int price) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isCheckQuantity(){
        if (this.quantity>0){
            System.out.println("There are still products!");
        }else {
            System.out.println("The product is out of stock!");
        }
        return this.quantity > 0;
    }
}
