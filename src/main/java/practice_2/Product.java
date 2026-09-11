package practice_2;

/**
 * Создайте класс Product с полями name и price. Реализуйте конструктор, геттеры, сеттер для цены, метод
 * applyDiscount(discount) для применения скидки, и метод printInfo(), выводящий информацию о товаре и цене.
 * В main измените цену, примените скидку и выведите цену.
 */
public class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void applyDiscount(double discount) {
        this.price = this.price - discount;
    }

    public void printInfo() {
        System.out.println("Product Name: " + name + ", Product Price: " + price);
    }
}
