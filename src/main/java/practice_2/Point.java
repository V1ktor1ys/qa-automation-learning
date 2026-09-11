package practice_2;

/**
 * Создайте класс Point с координатами x и y. Реализуйте конструктор, геттеры, сеттер только для x, и метод print(),
 * выводящий координаты. В main измените x, выведите новые координаты.
 */
public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return this.x;
    }

    void setX(double newX) {
        this.x = newX;
    }

    public void print() {
        System.out.println("Coordinates are: X - " + x + "; Y - " + y + ";");
    }
}
