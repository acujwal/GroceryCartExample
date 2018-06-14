package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String entered = "y";
        String item = "";
        double price = 0;
        Scanner input = new Scanner(System.in);

        shoppingCart thisCart = new shoppingCart();

        do {
            System.out.print("Enter an item to add to your Grocery List: ");
            item = input.nextLine();

            System.out.print("Enter the Price of your Grocery item: ");
            price = input.nextDouble();
            input.nextLine();

            groceryItem thisItem = new groceryItem(item, price);
            thisCart.addgroceryItem(thisItem);

            System.out.print("Do you want to Continue y / n ... ?");
            entered = input.nextLine();

        }
        while (entered.equalsIgnoreCase("y") || !entered.equalsIgnoreCase("n"));

        System.out.println(thisCart.displayItems());
        System.out.println("The total price is: " + thisCart.getTotal());


    }
}
