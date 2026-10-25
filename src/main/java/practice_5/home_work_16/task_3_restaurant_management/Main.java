package practice_5.home_work_16.task_3_restaurant_management;

public class Main {
    static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant();

        Product hotDish1 = new HotDish("HotDishName1", 111.11);
        restaurant1.addProduct(hotDish1);
        restaurant1.describeProducts();

        System.out.println("-------------------------------------------------------");

        Product drink1 = new Drink("DrinkName1", 222.22);
        restaurant1.addProduct(drink1);
        restaurant1.describeProducts();
    }
}
