package practice_6.restaurant_manager;

public class Main {

    static void main(String[] args) {
        RestaurantManager restaurantManager = new RestaurantManager();

        restaurantManager.addOrder("AAA");
        restaurantManager.printOrders();

        restaurantManager.addOrder("CCC");
        restaurantManager.addOrder("BBB");
        restaurantManager.printOrders();

        restaurantManager.processOrder();
        restaurantManager.printOrders();

        restaurantManager.removeOrder("BBB");
        restaurantManager.printOrders();
    }
}
