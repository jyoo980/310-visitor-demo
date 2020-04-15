package items;

import stores.Costco;
import stores.GroceryStore;
import stores.WalMart;

public class Pasta implements GroceryItem {

    private double baseCost = 1.99;

    @Override
    public void computeCost(GroceryStore store) {
        if (store instanceof Costco) {
            store.addToCost(this.baseCost);
        } else if (store instanceof WalMart) {
            store.addToCost(this.baseCost * 3);
        }
    }
}
