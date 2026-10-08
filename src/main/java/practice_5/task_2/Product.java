package practice_5.task_2;

public class Product implements Printable {

    private String name;
    private double price;
    private int count;

    public Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void print() {
        System.out.print("Product Name: " + this.name + ", Product Price: " + this.price + ", Product Quantity: " + this.count);
    }

}
