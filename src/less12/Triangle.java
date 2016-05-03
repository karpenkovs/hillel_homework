package less12;

public class Triangle extends GeometricFigure {

    int side_A;
    int side_B;
    int side_C;

    Triangle(int a, int b, int c) throws Exception {

        if (isTriangleTrue(a, b, c)) {

            name = "Triangle";
            side_A = a;
            side_B = b;
            side_C = c;
            perimeter = calculatePerimeter();
            area = calculateArea();
        } else {
            throw new IllegalArgumentException("This triangle does not exist! ");
        }
    }

    @Override
    public double calculatePerimeter() {
        return side_A + side_B + side_C;
    }

    @Override
    public double calculateArea() {

        if (isTheBase(side_A, side_B, side_C)) {

            return getAreaOfTriangle(side_A, side_B, side_C);

        } else if (isTheBase(side_B, side_A, side_C)) {

            return getAreaOfTriangle(side_B, side_A, side_C);

        } else {

            return getAreaOfTriangle(side_C, side_A, side_B);
        }
    }

    private boolean isTriangleTrue(int a, int b, int c) {

        if ((a + b) < c) {
            return false;
        } else if ((a + c) < b) {
            return false;
        } else if ((b + c) < a) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isTheBase(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return true;
        } else {
            return false;
        }
    }

    private double calculateValueOfCorner(int num1, int num2, int num3) {
        return Math.acos((Math.pow(num1, 2) + Math.pow(num2, 2) - Math.pow(num3, 2)) / (2 * num1 * num2));
    }

    private double getHeightOfTriangle(int hypotenuse, double corner) {
        return Math.sin(corner) * hypotenuse;
    }

    private double getAreaOfTriangle(int base, int side2, int side3) {

        return (base * getHeightOfTriangle(side3, calculateValueOfCorner(base, side2, side3))) / 2;
    }

}
