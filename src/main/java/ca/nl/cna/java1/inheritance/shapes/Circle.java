package ca.nl.cna.java1.inheritance.shapes;

/**
 * Circle class in Shape Hierarchy
 */
public class Circle extends Shape{

    private double radius;

    //TODO JavaDoc
    public Circle(double radius) {
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        //TODO check the radius
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String getDescription() {
        return "Circle with radius: " + this.radius + "Area: " + this.getArea();
    }
}
