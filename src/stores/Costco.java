package stores;

import items.Cookies;
import items.Pasta;
import items.ToiletPaper;

public class Costco extends GroceryStore {

    @Override
    public void visit(Cookies item) {
        this.totalCost += item.getCost();
    }

    @Override
    public void visit(Pasta item) {
        this.totalCost += item.getCost();
    }

    @Override
    public void visit(ToiletPaper item) {
        this.totalCost += item.getCost() * 999;
    }
}
