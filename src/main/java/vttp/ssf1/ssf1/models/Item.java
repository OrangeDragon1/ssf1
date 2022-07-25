package vttp.ssf1.ssf1.models;

public class Item {
    private String itemName;
    private Integer quantity;

    public Item(String itemName, Integer quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
