package practice_5.home_work_16.task_3_restaurant_management;

public class Drink extends Product {

    private static final String DEFAULT_VOLUME = "500ml";
    private static String productVolume;


    public Drink(String productName, double productPrice) {
        super(productName, productPrice);
        this.productVolume = DEFAULT_VOLUME;
    }

    @Override
    public void describe() {
        System.out.println("Product Name: " + getProductName() + ", Product Price: " + getProductPrice() + ", Product Volume: " + productVolume);
    }
}
