package Entity;

public class Food extends Category {
    private String foodId;
    private String foodName;
    private String foodDescription;
    private int foodPrice;
    private String foodCreateAt;

    public Food() {
    }

    public Food(String foodId, String categoryId, String foodName, String foodDescription, int gia, String foodCreateAt) {
        this.foodId = foodId;
        this.setCategoryId(categoryId);
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.foodPrice = gia;
        this.foodCreateAt = foodCreateAt;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodCreateAt() {
        return foodCreateAt;
    }

    public void setFoodCreateAt(String foodCreateAt) {
        this.foodCreateAt = foodCreateAt;
    }

    public String toString(){
        return String.format("%15s | %15s | %15s | %15d | %15s\n", getFoodId(), getFoodName(), getFoodDescription(), getFoodPrice(), getFoodCreateAt());
    }
}
