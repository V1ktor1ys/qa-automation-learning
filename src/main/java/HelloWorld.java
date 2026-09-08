public class HelloWorld {

    //Fields:

    static int a = 1;

    //Methods:

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is V1ktor1ys!");
        System.out.println(1 + 2);
        System.out.println(3 * 5);
        System.out.println("Field 'a' stores: " + a);

        int sum1 = sum(10, 20);
        System.out.println("SUM result: " + sum1);

        int mult1 = multiply(5, 5);
        System.out.println("MULTIPLY result: " + mult1);

        int sub1 = substruct(10, 5);
        System.out.println("SUBSTRUCT result: " + sub1);

        double div1 = divide(10, 3);
        System.out.println("DIVIDE result: " + div1);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static int substruct(int a, int b) {
        return  a - b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

}
