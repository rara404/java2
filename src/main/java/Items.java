public class Items {
    private float price;
    private int quantity;
    private String itemName;

    public Items(float price, int quantity, String itemName) {
        this.price = price;
        this.quantity = quantity;
        this.itemName = itemName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemName() {
        return itemName;
    }


}
