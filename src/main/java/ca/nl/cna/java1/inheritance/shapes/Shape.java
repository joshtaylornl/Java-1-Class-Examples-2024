package ca.nl.cna.java1.inheritance.shapes;

/**
 * Base class in the Shape hierarchy. Asserts that all shapes must have an area.
 */
abstract public class Shape {

    /**
     * Get the area of the Shape. The defining method of the Shape hierarchy.
     * @return
     */
    abstract public double getArea();

    //TODO add a comparison method?

    public String getDescription(){
        return "This is a shape!";
    }


}
