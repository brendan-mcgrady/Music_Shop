import java.util.ArrayList;

public class Shop {
    // Create a Shop class, which has a collection of ISell items, called stock. In your shop you should be able to:

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStockItems() {
        return this.stock;
    }

    // add items to stock.

    public void addItemToStock(ISell item) {
        this.stock.add(item);
    }

    // remove items from stock.

    public void removeItemFromStock(ISell item) {
        this.stock.remove(item);
    }

    // Using the calculateMarkup method for each item in stock,
    // create a method which gives the total potential profit for the shop.


}

