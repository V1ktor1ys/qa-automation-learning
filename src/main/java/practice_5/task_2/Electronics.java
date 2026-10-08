package practice_5.task_2;

public class Electronics extends Product {

    private static final int DEFAULT_GUARANTEE = 2;
    private static int guarantee;

    public Electronics(String name, double price, int count) {
        super(name, price, count);
        this.guarantee = DEFAULT_GUARANTEE;
    }

    public static int getGuarantee() {
        return guarantee;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", Product Guarantee: " + this.guarantee);
    }

}
