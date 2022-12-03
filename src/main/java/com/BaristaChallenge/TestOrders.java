package com.BaristaChallenge;

public class TestOrders {
    public static void main(String[] args) {
        // Menu Items
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("Coffee", 2.0);
        Item item3 = new Item("Latte", 3.0);
        Item item4 = new Item("Dark Roast", 2.5);



        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Alan");
        Order order4 = new Order("Seth");
        Order order5 = new Order("Jim");

        order1.addItem(item4);
        order1.addItem(item3);
        order2.addItem(item3);
        order2.addItem(item2);
        order3.addItem(item2);
        order3.addItem(item1);
        order4.addItem(item1);
        order4.addItem(item4);
        order5.addItem(item2);
        order5.addItem(item4);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        order1.updateOrderStatus(true);
        order2.updateOrderStatus(true);
        order3.updateOrderStatus(false);
        order4.updateOrderStatus(true);
        order5.updateOrderStatus(false);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

    }
}
