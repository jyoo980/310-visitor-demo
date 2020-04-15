package items;

import stores.GroceryStore;

public class ToiletPaper implements GroceryItem {

    private double baseCost = 99.99;

    @Override
    public void accept(GroceryStore store) {
        store.visit(this);
    }

    public double getCost() {
        return this.baseCost;
    }
}
