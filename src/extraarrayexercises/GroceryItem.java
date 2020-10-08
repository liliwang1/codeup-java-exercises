package extraarrayexercises;

public class GroceryItem {
    private String name;
    private int quantity;
    private String category;

//    public GroceryItem(String name, int quantity, String category) {
//        this.name = name;
//        this.quantity = quantity;
//        this.category = category;
//    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name.trim().toLowerCase();
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category.trim().toLowerCase();
    }
}
