package items;

import stores.GroceryStore;

public class Pasta implements GroceryItem {

    private double baseCost = 1.99;

    @Override
    public void accept(GroceryStore store) {
        store.visit(this);
    }

    public double getCost() {
        return this.baseCost;
    }
}
