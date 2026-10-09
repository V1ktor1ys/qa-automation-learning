package practice_5.home_work_16.task_3_restaurant_management;

public class HotDish extends Product {

    private static final double DEFAULT_TEMPERATURE = 60;
    private static double productTemperature;

    public HotDish(String productName, double productPrice) {
        super(productName, productPrice);
        this.productTemperature = DEFAULT_TEMPERATURE;
    }

    @Override
    public void describe() {
        System.out.println("Product Name: " + getProductName() + ", Product Price: " + getProductPrice() + ", Product Temperature: " + productTemperature);
    }
}
