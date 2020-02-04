package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side); // pass side twice into rectangle's "length" and "width"
    }

    public double getArea(double side){
        System.out.println("Square Area: "); // distinguishes Square method from Rectangle
        return side * side;
    }

    public double getPerimeter(double side) {
        System.out.println("Square Perimeter: ");  // distinguishes Square method from Rectangle
        return 4 * side;
    }

}
