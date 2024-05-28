import java.util.Objects;

/**
 * This class represents a Rectangle, which is a specific type of Shape.
 * It extends the Shape class and overrides its methods to provide the functionality specific to a Rectangle.
 */
public class Rectangle extends Shape {
    private double length; // The length of the rectangle
    private double width; // The width of the rectangle

    /**
     * Constructor for the Rectangle class.
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     */
    public Rectangle(double length, double width) {
        super(4); // Call the constructor of the superclass Shape with the number of sides for a rectangle
        this.shapeType = ShapeType.RECTANGLE; // Set the shape type to RECTANGLE
        this.length = length; // Set the length
        this.width = width; // Set the width
        perimeter = calculatePerimeter(); // Calculate the perimeter
        area = calculateArea(); // Calculate the area
    }

    /**
     * This method calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    /**
     * This method calculates the area of the rectangle.
     * @return The area of the rectangle
     */
    public double calculateArea() {
        return length * width;
    }

/**
 * This method checks if the given object is equal to this rectangle.
 * It first checks if the given object is the same as this rectangle.
 * If not, it checks if the given object is a rectangle and compares its length and width to this rectangle's length and width.
 * @param o The object to be compared with this rectangle
 * @return true if the given object is a rectangle with the same length and width as this rectangle, false otherwise
 */
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rectangle rectangle = (Rectangle) o;
    return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
}

/**
 * This method returns a hash code value for the rectangle.
 * It uses the length and width of the rectangle to generate the hash code.
 * @return a hash code value for this rectangle
 */
@Override
public int hashCode() {
    return Objects.hash(length, width);
}

    /**
     * This method returns a string representation of the Rectangle object.
     * @return A string representation of the Rectangle object
     */
    @Override
    public String toString() {
        return super.toString() +
                ", length: " + length +
                ", width: " + width;
    }
}