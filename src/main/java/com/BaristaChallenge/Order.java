package com.BaristaChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Class to handle new order creation
 * @author alanlytton
 */
public class Order {
    private String name;
//    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    /**
     * Empty constructor to add "Guest" default name, and instantiate the ArrayList for Items.
     */
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    /**
     * Constructor to set a custom name and instantiate the Array List for Items
     * @param name name of the customer to which this order belongs.
     */
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    /**
     * Getter to retrieve name on the order
     * @return The name on the order
     */
    public String viewName(){
        return this.name;
    }

    /**
     * Setter to update name on the order
     * @param name name that should be reflected on order after change.
     */
    public void updateOrderName(String name){
        this.name = name;
    }

    /**
     * Getter to display the list of items on the order
     * @return The list of items on the order
     */
    public ArrayList<Item> viewOrderItems(){
        return this.items;
    }

    /**
     * Getter to display if the order is ready using boolean values
     * @return boolean value to indicate if order is ready or not.
     */
    public boolean isOrderReady(){
        return this.ready;
    }

    /**
     * Setter to update the order status
     * @param ready Boolean value to indicate updated order status.
     */
    public void updateOrderStatus(boolean ready){
        this.ready = ready;
    }

    /**
     * Add item method to add a new item object to the List
     * @param item Item object to be added to the List.
     */
    public void addItem(Item item){
        this.items.add(item);
    }

    /**
     * Method to display current status of the order based on Boolean values
     * @return
     */
    public String getStatusMessage(){
        String orderStatus = "Your Order is Ready";
        if (this.ready == false){
            orderStatus = "Thank you for waiting. Your order will be ready shortly.";
        }
        return orderStatus;
    }

    /**
     * Method to calculate order total.
     * @return The total of all items in the order.
     */
    public double getOrderTotal(){
        double orderTotal = 0.0;
        for(int i = 0; i < this.items.size(); i++){
            orderTotal += this.items.get(i).viewItemPrice();
        }
        return orderTotal;
    }

    /**
     * Method to display the customer name, individual items ordered and the total of all items.
     */
    public void display(){
        System.out.println("Customer Name: " + viewName());
        for(int i = 0; i < this.items.size(); i++){
            System.out.println(this.items.get(i).viewItemName() + " - " + this.items.get(i).viewItemPrice());
        }
        System.out.println("Total: " + getOrderTotal());

    }
}
