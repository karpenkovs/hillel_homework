package less12;

public class FigureShop {

    public static void main(String[] args)  {

        Circle circle = new Circle(10);
        circle.print();

        double time = System.nanoTime();
        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.print();
        System.out.println((System.nanoTime() - time));

        Square square = new Square(4);
        square.print();

        RightTriangle rightTriangle = new RightTriangle(6, 9);
        rightTriangle.print();

        time = System.nanoTime();
        try {
            Triangle triangle = new Triangle(3, 5, 7);
            triangle.print();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println((System.nanoTime() - time));

    }
}
