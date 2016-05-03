package less12;

public class Rectangle extends GeometricFigure{

    int side_A;
    int side_B;

    Rectangle(int side_A, int side_B){

        name = "Rectangle";
        this.side_A = side_A;
        this.side_B = side_B;
        perimeter = calculatePerimeter();
        area = calculateArea();
    }


    @Override
    public double calculatePerimeter() {
        return (side_A + side_B) * 2;
    }

    @Override
    public double calculateArea() {
        return side_A * side_B;
    }
}
