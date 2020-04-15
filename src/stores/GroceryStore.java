package stores;

public class GroceryStore {

    protected double totalCost;

    public void addToCost(double cost) {
        this.totalCost += cost;
    }

    public double getTotalCost() {
        return this.totalCost;
    }
}
