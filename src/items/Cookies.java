package items;

import stores.GroceryStore;

public class Cookies implements GroceryItem {

    private double baseCost = 2.50;

    @Override
    public void accept(GroceryStore store) {
        store.visit(this);
    }

    public double getCost() {
        return this.baseCost;
    }
}
