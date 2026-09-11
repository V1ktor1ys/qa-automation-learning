package practice_2;

/**
 * Создайте класс Rectangle с полями width и height. Реализуйте конструктор, геттеры для ширины и высоты, сеттер только
 * для ширины и метод calculateArea() для расчёта площади. В main создайте прямоугольник, измените ширину и выведите площадь.
 */
public class Rectangle {

    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getWidth() {
        return this.width;
    }

    double getHeight() {
        return this.height;
    }

    void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double calculateArea() {
        return width * height;
    }

}
