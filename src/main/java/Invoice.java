public class Invoice {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private int zipcode;
    private ShoppingCart shoppingCart;



    public Invoice(String name, String address, String city, String state, int zipcode, ShoppingCart shoppingCart) {
        this.name = name;
        this.streetAddress = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        String header = "Ship to:\n  " +
                        this.name + "\n  " +
                        this.streetAddress + "\n  " +
                        this.city + ", " + this.state + " " + this.zipcode + "\n\n" +
                        "Items\n" +
                        "-----\n" ;

        String itemList = "";
        for (Items i: shoppingCart.getShoppingCart()){
            itemList += i.getItemName() + " $" + i.getPrice() + " (" + i.getQuantity() + ")  $" + (i.getPrice()*i.getQuantity()) + "\n";
        }

        String shipping = "\nShipping: ";
        if(shoppingCart.getShippingCost() == 0)
            shipping += "Free\n\n";
        else
            shipping += shoppingCart.getShippingCost();

        String totalCost =  "Total Cost\n" +
                            "----------\n" +
                            shoppingCart.getTotal();

        return header + itemList + shipping + totalCost;
    }
}
