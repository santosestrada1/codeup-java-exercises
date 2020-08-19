package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral myShape;
        myShape = new Rectangle(4, 5);
        System.out.printf("Perimeter: %f\tArea: %f\n", myShape.getPerimeter(), myShape.getArea());
        System.out.println(myShape.getLength());
        myShape = new Square(5);
        System.out.printf("Perimeter: %f\tArea: %f\n", myShape.getPerimeter(), myShape.getArea());
        System.out.println(myShape.getWidth());
    }
}