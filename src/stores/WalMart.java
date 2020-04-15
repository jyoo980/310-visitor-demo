package stores;

import items.Cookies;
import items.Pasta;
import items.ToiletPaper;

public class WalMart extends GroceryStore {

    @Override
    public void visit(Cookies item) {
        this.totalCost += item.getCost() * 2;
    }

    @Override
    public void visit(Pasta item) {
        this.totalCost += item.getCost() * 3;
    }

    @Override
    public void visit(ToiletPaper item) {
        this.totalCost += item.getCost() * 1000;
    }
}
