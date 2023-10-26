import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Items> shoppingCart;
    private float total = 0;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItem(Items i) {
        this.shoppingCart.add(i);
    }

    public void calculateTotal(){
        for(Items items: shoppingCart){
            total += (items.getPrice()*items.getQuantity());
        }
    }

    public String getTotal(){
        return "$" + this.total;
    }

}
