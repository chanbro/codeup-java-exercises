package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    protected double setLength(double side) {
        return side;
    }

    @Override
    protected double setWidth(double side) {
        return side;
    }

    @Override
    public double getPerimeter() {
        return this.side * this.side;
    }

    @Override
    public double getArea() {
        return 4 * this.side;
    }
//    public Square(double side){
//        super(side, side); // pass side twice into rectangle's "length" and "width"
//    }
//
//    public double getArea(double side){
//        System.out.println("Square Area: "); // distinguishes Square method from Rectangle
//        return side * side;
//    }
//
//    public double getPerimeter(double side) {
//        System.out.println("Square Perimeter: ");  // distinguishes Square method from Rectangle
//        return 4 * side;
}
