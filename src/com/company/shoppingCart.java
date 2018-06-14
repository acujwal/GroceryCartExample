package com.company;

import java.util.ArrayList;

public class shoppingCart {

    ArrayList<groceryItem> groceryItems;

    public shoppingCart(){
        groceryItems = new ArrayList<groceryItem>();
    }

    public void  addgroceryItem(groceryItem toAdd){
        this.groceryItems.add(toAdd);
    }
    public double getTotal(){
        double totalPrice = 0;
        for (groceryItem G: groceryItems){
            totalPrice += G.getPrice();
            }
            return totalPrice;
    }
    public String displayItems(){
        String toDisplay = "";

        for (groceryItem G: groceryItems){
            toDisplay = G.getName() +"    " + G.getPrice()+ "\n";

        }
        return toDisplay;
    }


}
