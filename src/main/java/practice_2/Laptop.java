package practice_2;

/**
 * Создайте класс Laptop с полями brand и price. Реализуйте конструктор, геттеры и сеттеры, и метод printInfo(),
 * выводящий информацию о ноутбуке и его цене. В main измените цену и выведите информацию.
 */
public class Laptop {

    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Brand Name: " + brand + ", Price: " + price);
    }
}
