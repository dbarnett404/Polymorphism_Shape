/**
 * This class represents a Triangle, which is a specific type of Shape.
 * It extends the Shape class and overrides its methods to provide the functionality specific to a Triangle.
 */
public class Triangle extends Shape {
    private double side1; // The length of the first side of the triangle
    private double side2; // The length of the second side of the triangle
    private double side3; // The length of the third side of the triangle

    /**
     * Constructor for the Triangle class.
     * @param side1 The length of the first side of the triangle
     * @param side2 The length of the second side of the triangle
     * @param side3 The length of the third side of the triangle
     */
    public Triangle(double side1, double side2, double side3) {
        super(3); // Call the constructor of the superclass Shape with the number of sides for a triangle
        this.shapeType = ShapeType.TRIANGLE; // Set the shape type to TRIANGLE
        this.side1 = side1; // Set the length of the first side
        this.side2 = side2; // Set the length of the second side
        this.side3 = side3; // Set the length of the third side
        perimeter = calculatePerimeter(); // Calculate the perimeter
        area = calculateArea(); // Calculate the area
    }

    /**
     * This method calculates the perimeter of the triangle.
     * @return The perimeter of the triangle
     */
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * This method calculates the area of the triangle using Heron's formula.
     * @return The area of the triangle
     */
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * This method returns a string representation of the Triangle object.
     * @return A string representation of the Triangle object
     */
    @Override
    public String toString() {
        return super.toString() +
                ", side1: " + side1 +
                ", side2: " + side2 +
                ", side3: " + side3;
    }
}