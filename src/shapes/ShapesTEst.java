package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Square(6);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Rectangle(5, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        // 9. Code will not compile without all methods listed in the interface because they are abstract by default
        // 10. It cannot be implemented because it is implemented within the class of Rectangle and Square. Measurable is not directly implemented in the ShapesTest class, it is only being used to create instances of the interface.

//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("Area: " + box1.getArea());
//        System.out.println("Perimeter: " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5); // Creating new instance of Square; calls Square methods extended from Rectangle
//        System.out.println("Area: " + box2.getArea());
//        System.out.println("Perimeter: " + box2.getPerimeter());
    }
}
