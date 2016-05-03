package less12;

public class Square extends GeometricFigure {

    int side;

    Square(int side){

        name = "Square";
        this.side = side;
        perimeter = calculatePerimeter();
        area = calculateArea();
        perimeter = calculatePerimeter();
        area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
