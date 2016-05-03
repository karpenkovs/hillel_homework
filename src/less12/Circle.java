package less12;

public class Circle extends GeometricFigure {

    int radius;
    final float pi;

    Circle(int radius) {

        name = "Circle";
        this.radius = radius;
        pi = (float) 3.14;
        perimeter = calculatePerimeter();
        area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double calculateArea() {
        return pi * Math.pow(radius, 2);
    }
}
