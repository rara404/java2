import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Items> shoppingCart;
    private float total = 0;
    private double shippingCost = 0;

    private double salesTax;



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
        calculateShiping();
        calculateSalesTax();
        total += (this.salesTax + this.shippingCost);
    }

    public void calculateShiping(){
        if(this.total < 10)
            this.shippingCost = 10;
    }

    public void calculateSalesTax(){
            this.salesTax = 0.1 * this.total;
    }



    public String getTotal(){
        return "$" + this.total;
    }

    public ArrayList<Items> getShoppingCart() {
        return shoppingCart;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public Invoice shipOrder(String name, String add, String city, String state, int zip ){
        return new Invoice(name, add, city, state, zip, this);
    }

}
