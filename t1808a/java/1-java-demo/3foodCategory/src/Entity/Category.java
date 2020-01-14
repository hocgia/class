package Entity;

public class Category {
    private String categoryId;
    private String categoryName;
    private String categoryDescription;
    private String categoryCreateAt;

    public Category() {
    }

    public Category(String categoryId, String categoryName, String categoryDescription, String categoryCreateAt) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.categoryCreateAt = categoryCreateAt;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryCreateAt() {
        return categoryCreateAt;
    }

    public void setCategoryCreateAt(String categoryCreateAt) {
        this.categoryCreateAt = categoryCreateAt;
    }

    @Override
    public String toString() {
        return String.format("%15s | %15s | %15s | %15s ", getCategoryId(), getCategoryName(), getCategoryDescription(), getCategoryCreateAt());
    }
}
