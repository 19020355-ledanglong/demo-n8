public class Square extends Rectangle {
    /**
     * Construction 1. 
     */
    public Square() {
    }

    /**
     * Construction 2.
     */
    public Square(double side) {
        width = side;
        length = side;
    }

    /**
     * Construction 3. 
     */
    public Square(double side, String color, boolean filled) {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    /**
     * getSide function. 
     */
    public double getSide() {
        return length;
    }

    /**
     * setSide function.
     */
    public void setSide(double side) {
        width = side;
        length = side;
    }

    /**
     * setWidth function.
     */
    @Override
    public void setWidth(double side) {
        width = side;
    }

    /**
     * setLength function.
     */
    @Override
    public void setLength(double side) {
        length = side;
    }

    /**
     * toString function. 
     */
    public String toString() {
        String a = String.valueOf(width);
        String b = color;
        String c = String.valueOf(filled);
        return "Square[side=" + a + ",color=" + b + ",filled=" + c + "]";
    }
}