package items;

import stores.Costco;
import stores.GroceryStore;
import stores.WalMart;

public class ToiletPaper implements GroceryItem {

    private double baseCost = 99.99;

    @Override
    public void computeCost(GroceryStore store) {
        if (store instanceof Costco) {
            store.addToCost(this.baseCost * 999);
        } else if (store instanceof WalMart) {
            store.addToCost(this.baseCost * 1000);
        }
    }
}
