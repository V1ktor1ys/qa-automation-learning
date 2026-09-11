public class MathOperations {

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        System.out.println("TASK-1");
        System.out.println(mathOperations.add(15, 20)); //result = 35
        System.out.println(mathOperations.subtract(30, 15)); //result = 15
        System.out.println(mathOperations.multiply(15, 3)); //result = 45
        System.out.println(mathOperations.divide(15, 2)); //result = 7.5

        System.out.println("TASK-2");
        System.out.println(mathOperations.findMax(5, 3)); //result = 5
        System.out.println(mathOperations.findMax(5, 8)); //result = 8

        System.out.println("TASK-3");
        System.out.println(mathOperations.defference(10, 4)); //result = 6
        System.out.println(mathOperations.defference(5, 10)); //result = 5
        System.out.println(mathOperations.defference(-10, -7)); //result = 3

        System.out.println("TASK-4");
        System.out.println(mathOperations.squareArea(5)); //result = 25
        System.out.println(mathOperations.squarePerimeter(5)); //result = 20

        System.out.println("TASK-5");
        System.out.println(mathOperations.convertSecondsToMinutes(60)); //result = 1.0
        System.out.println(mathOperations.convertSecondsToMinutes(90)); //result = 1.5

        System.out.println("TASK-6");
        System.out.println(mathOperations.averageSpeed(15, 3)); //result = 5 OR 5.0
        System.out.println(mathOperations.averageSpeed(21, 4)); //result = 5.25
        System.out.println(mathOperations.averageSpeed(33.5, 15.3)); //result = 2.189542483660131

        System.out.println("TASK-7");
        System.out.println(mathOperations.findHypotenuse(3.0, 4.0)); //result = 5.0
        System.out.println(mathOperations.findHypotenuse(5.0, 12.0)); //result = 13.0
        System.out.println(mathOperations.findHypotenuse(2.5, 3.5)); //result = 4.3012

        System.out.println("TASK-8");
        System.out.println(mathOperations.circleCircumference(1.0)); //result = 6.28
        System.out.println(mathOperations.circleCircumference(2.0)); //result = 12.56
        System.out.println(mathOperations.circleCircumference(3.0)); //result = 18.84

        System.out.println("TASK-9");
        System.out.println(mathOperations.calculatePercentage(200, 25) + "%"); //result = 12.5%
        System.out.println(mathOperations.calculatePercentage(1000, 1) + "%"); //result = 0.1%

        System.out.println("TASK-10");
        System.out.println(mathOperations.celsiusToFahrenheit(36.6)); //result = 97.88
        System.out.println(mathOperations.fahrenheitToCelsius(97.88)); //result = 36.6

    }

    /**
     * TASK-1
     * add(int x, int y) — возвращает сумму двух чисел
     * subtract(int x, int y) — разницу
     * multiply(int x, int y) — произведение
     * divide(int x, int y) — результат деления в double
     */

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }

    /**
     * TASK-2
     * Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
     * Вызовите метод в main и выведите результат.
     */

    int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * TASK-3
     * Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
     * Проверьте метод в main.
     */

    int defference(int x, int y) {
        return Math.abs(x - y);
    }

    /**
     * TASK-4
     * Создайте два метода:
     * squareArea(int side) — возвращает площадь квадрата
     * squarePerimeter(int side) — возвращает периметр
     * Вызовите оба метода в main с примером.
     */

    int squareArea(int side) {
        return side * side;
    }

    int squarePerimeter(int side) {
        return side * 4;
    }

    /**
     * TASK-5
     * Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
     * Вызовите метод в main и выведите результат.
     */

    double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    /**
     * TASK-6
     * Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
     * Вызовите метод с разными значениями.
     */

    double averageSpeed(double distance, double time) {
        return distance / time;
    }

    /**
     * TASK-7
     * Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
     * √(a² + b²)
     * Вызовите метод с несколькими наборами чисел.
     */

    double findHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    /**
     * TASK-8
     * Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
     * Проверьте работу на нескольких значениях.
     */

    double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    /**
     * TASK-9
     * Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
     * Пример: 25 из 200 → 12.5%
     */

    double calculatePercentage(double total, double part) {
        return part / total * 100.0;
    }

    /**
     * TASK-10
     * Создайте два метода:
     * celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
     * fahrenheitToCelsius(double f) — перевод в Цельсий: (F − 32) × 5 / 9
     * Проверьте оба метода в main.
     */

    double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }


}
