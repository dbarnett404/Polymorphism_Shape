/**
 * This class represents a Square, which is a specific type of Rectangle.
 * It extends the Rectangle class and overrides its methods to provide the functionality specific to a Square.
 */
public class Square extends Rectangle{
    /**
     * Constructor for the Square class.
     * @param side The length of the side of the square
     */
    public Square(double side) {
        super(side, side); // Call the constructor of the superclass Rectangle with the length and width of the square
        shapeType = ShapeType.SQUARE; // Set the shape type to SQUARE
    }

    /**
     * This method returns a string representation of the Square object.
     * @return A string representation of the Square object
     */
    @Override
    public String toString() {
        return super.toString();
    }
}