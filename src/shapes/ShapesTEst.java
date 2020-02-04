package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Area: " + box1.getArea(4,5));
        System.out.println("Perimeter: " + box1.getPerimeter(4,5));

        Square box2 = new Square(5);
        System.out.println("Area: " + box2.getArea(5));
        System.out.println("Perimeter: " + box2.getPerimeter(5));
    }
}
