package lessons_3_1_2;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }

    /**
     * Determines if a rectangle is a square
     * @return true if the rectangle is a square, false if it is not
     */
    public boolean isSquare(){return this.width == this.height;}

    public boolean equals(Rectangle r) {
        if (this == r) return true;
        if (r == null || getClass() != r.getClass()) return false;
        Rectangle rectangle = (Rectangle) r;
        return width == rectangle.width && height == rectangle.height;
    }



}
