package assignment4;

import java.util.ArrayList;

public class Cart {
    private String id;
    private String custumer;
    private double grandTotal;
    private String city;
    private ArrayList<Product> productList = new ArrayList<>();

    public Cart() {
    }

    public Cart(String id, String custumer, double grandTotal, String city, ArrayList<Product> productList) {
        this.id = id;
        this.custumer = custumer;
        this.grandTotal = grandTotal;
        this.city = city;
        this.productList = productList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustumer() {
        return custumer;
    }

    public void setCustumer(String custumer) {
        this.custumer = custumer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public boolean addProduct(Product product) {
        return this.productList.add(product);
    }

    public boolean deleteProduct(String productId) {
        return this.productList.removeIf(product -> product.getId().equals(productId));
    }

    public void calculatorGrandTotal() {
        double percent = 0;
        if (this.city.equals("HN") || this.city.equals("HCM")) {
            percent = 0.01;
        }
        if (this.city.equals("ngoại thành")) {
            percent = 0.02;
        }
        this.grandTotal = this.grandTotal * (1 + percent);
    }

}
