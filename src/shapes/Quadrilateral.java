package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    abstract double setLength(double length);
    abstract double setWidth(double width);

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }




}
