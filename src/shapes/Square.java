package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    public double getArea(double side){
        return side * side;
    }

    public double getPerimeter(double side) {
        return 4 * side;
    }

}
