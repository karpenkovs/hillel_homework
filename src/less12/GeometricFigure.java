package less12;

public abstract class GeometricFigure {

    String name;
    double perimeter;
    double area;


    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public void print() {
        System.out.println("Perimeter of the " + name + " is: " + perimeter);
        System.out.println("Area of the " + name + " is: " + area);
        System.out.println();
    }

}
