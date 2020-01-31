package shapes;
import util.Input;

public class Circle {
    private double radius;
    private static int circlesCreated = 0;

    public static void main(String[] args) {
        Input input = new Input();
        do {
            double radius = input.getDouble("What is the radius of the circle?");
            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            circlesCreated++;
            System.out.println("Circles created: " + circlesCreated);
        } while (input.yesNo("Do you want to make another?"));
    }

    //    public Circle() {
//
//    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getCircumference() {
        return 2 * this.radius * Math.PI;
    }

    public static int getCirclesCreated(){
        return circlesCreated;
    }

}



