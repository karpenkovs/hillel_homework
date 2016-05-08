package less12;

public class Circle extends GeometricFigure {

    int radius;
    final float PI = 3.14f;

    Circle(int radius) {

        name = "Circle";
        this.radius = radius;
        perimeter = calculatePerimeter();
        area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }
}
