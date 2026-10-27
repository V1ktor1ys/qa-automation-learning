package practice_6.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {

    private LinkedList<String> orders;

    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }

    // add an order to the end of the queue
    public void addOrder(String order) {
        orders.addLast(order);
    }

    // process the order at the beginning of the queue
    public void processOrder() {
        orders.pollFirst();
    }

    // remove the order from any position in the queue
    public void removeOrder(String order) {
        orders.remove(order);
    }

    public void printOrders() {
        System.out.println("ORDERS: ");
        orders.forEach(System.out::println);
        System.out.println();
    }
}
