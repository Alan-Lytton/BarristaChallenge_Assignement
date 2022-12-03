package com.BaristaChallenge;

/**
 * Class to build new menu Items
 * @author alanlytton
 */
public class Item {
    private String name;
    private double price;

    /**
     * Constructor class to instantiate new objects
     * @param name name of the new menu item
     * @param price price of the new menu item
     */
    public Item(String name,double price){
        this.name = name;
        this.price = price;
    }

    /**
     * Getter to retrieve menu item name
     * @return name of the menu item
     */
    public String viewItemName(){
        return this.name;
    }

    /**
     * Setter to change an items name.
     * @param name The name that the current item should reflect after change.
     */
    public void updateItemName(String name){
        this.name = name;
    }

    /**
     * Getter to retrieve menu item price
     * @return price of the menu item
     */
    public double viewItemPrice(){
        return this.price;
    }

    /**
     * Setter to change an items price
     * @param price The price that the current item should reflect after change.
     */
    public void updateItemPrice(double price){
        this.price = price;
    }
}
