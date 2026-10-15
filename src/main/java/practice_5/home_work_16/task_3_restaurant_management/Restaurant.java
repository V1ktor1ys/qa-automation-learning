package practice_5.home_work_16.task_3_restaurant_management;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void describeProducts() {
        for (Product product : products) {
            product.describe();
        }
    }
}
