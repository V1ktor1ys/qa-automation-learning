package practice_2;

/**
 * Создайте класс Circle с полем radius. Реализуйте конструктор, геттер и сеттер, методы calculateArea() и
 * calculateCircumference(). В main измените радиус, выведите площадь и длину окружности.
 */
public class Circle {

    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    float getRadius() {
        return this.radius;
    }

    void setRadius(float newRadius) {
        this.radius = newRadius;
    }

    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public float calculateCircumference() {
        return (float) (2 * Math.PI * radius);
    }
}
