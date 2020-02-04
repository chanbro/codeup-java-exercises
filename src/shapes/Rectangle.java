package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

}


/*

Subclass: children of the class
Superclass: Extended to be inherited by subclasses



4 Pillars of OOP

*** ABSTRACTION ***
- Exposing essential/hiding unnecessary details to reduce program complexity
- Class definitions, private, interfaces, abstract classes
- Movies array separate from the movies application to reduce clutter
- Public: everything has access; Private: access only within class

*** ENCAPSULATION ***
 - Data, properties, methods in cohesive entity
 - Classes, instances, properties
 - Scope

 *** INHERITANCE ***
 - Deriving a new class from an existing type
 - Extends classes, overriding, super
 - Differences between a speed bike and a mountain bike
 - Final: constant, cannot extend to (be inherited by) other classes (subclasses)

*** POLYMORPHISM ***
- Entity takes different meanings depending on context


*/