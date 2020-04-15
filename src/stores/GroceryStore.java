package stores;

import items.Cookies;
import items.Pasta;
import items.ToiletPaper;

public abstract class GroceryStore {

    protected double totalCost;

    public GroceryStore() {
        this.totalCost = 0.0;
    }

    public void visit(Cookies item) {

    }

    public void visit(Pasta item) {

    }

    public void visit(ToiletPaper item) {

    }

    public double getTotalCost() {
        return this.totalCost;
    }
}
