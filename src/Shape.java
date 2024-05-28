/**
 * This class represents a generic Shape. It is the base class for all specific shapes.
 * It contains common properties like the type of shape, number of sides, perimeter, and area.
 */
public class Shape {
    protected ShapeType shapeType; // The type of the shape
    private int numSides; // The number of sides of the shape
    protected double perimeter; // The perimeter of the shape
    protected double area; // The area of the shape

    /**
     * Constructor for the Shape class.
     * @param numSides The number of sides of the shape
     */
    public Shape(int numSides) {
        this.numSides = numSides;
    }

    /**
     * This method calculates the perimeter of the shape.
     * @return The perimeter of the shape
     */
    public double calculatePerimeter() {
        return perimeter;
    }

    /**
     * This method calculates the area of the shape.
     * @return The area of the shape
     */
    public double calculateArea() {
        return area;
    }

    /**
     * This method checks the type of the shape using instanceof operator.
     * @return The type of the shape as a string
     */
    public String checkShapeType() {
        if (this instanceof Rectangle) {
            return "Rectangle";
        } else if (this instanceof Square) {
            return "Square";
        } else if (this instanceof Triangle) {
            return "Triangle";
        } else {
            return "Unknown Shape";
        }
    }

    /**
     * The method override the toString method of the Object class.
     * @return A string representation of the Shape object
     */
    @Override
    public String toString() {
        return "Shape Type: " + shapeType +
                ", numSides: " + numSides +
                ", perimeter: " + perimeter +
                ", area: " + area;
    }
}