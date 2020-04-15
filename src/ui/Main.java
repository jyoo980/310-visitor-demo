package ui;

import items.Cookies;
import items.GroceryItem;
import items.Pasta;
import items.ToiletPaper;
import stores.Costco;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<GroceryItem> groceryList = Arrays.asList(new ToiletPaper(), new Cookies(), new Pasta());
        Costco costcoCart = new Costco();
        for (GroceryItem item : groceryList) {
            item.accept(costcoCart);
        }
        System.out.println("Cost of buying groceries from costco: " + costcoCart.getTotalCost());
    }
}
