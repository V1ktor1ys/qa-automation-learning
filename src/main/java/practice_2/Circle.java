package practice_2;

/**
 * Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер, методы calculateArea() и
 * calculateCircumference(). В main измените радиус, выведите площадь и длину окружности.
 */
public class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double calculateCircumference() {
        return (2 * Math.PI * radius);
    }
}
