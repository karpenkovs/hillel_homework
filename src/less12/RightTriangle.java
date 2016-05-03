package less12;

public class RightTriangle extends GeometricFigure {

    int cathetus_A;
    int cathetus_B;



    RightTriangle(int a, int b) {

        name = "Right triangle";
        cathetus_A = a;
        cathetus_B = b;
        perimeter = calculatePerimeter();
        area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return  calculateHypotenuse() + cathetus_A + cathetus_B;
    }

    @Override
    public double calculateArea() {
        return cathetus_A * cathetus_B / 2;
    }

    private double calculateHypotenuse (){
        return Math.sqrt(Math.pow(cathetus_A, 2) + Math.pow(cathetus_B, 2));
    }
}
