package sorts.animationeStep;

import javafx.scene.paint.Color;

/**
 * Created by ria on 10/15/15.
 */
public class Rectangle implements Comparable<Rectangle> {

    private final int value;
    private Color color;

    public Rectangle(int value) {
        this.value = value;
        this.color = new Color(0, 0, 0, 1);
    }

    /**
     * Returns the height of this rectangle.
     * @return the height of this Rectangle
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the current color of this rectangle.
     * @return Color of the Rectangle
     */
    public Color getColor() {
        return color;
    }

    /**
     * Sets the color of this rectangle to be the color
     * @param color the new Color of this Rectangle
     */
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        ret.append("Rectangle with height ");
        ret.append(value);
        return ret.toString();
    }

    @Override
    public int compareTo(Rectangle that) {
        int ret = 0;
        if (this.value > that.getValue()) {
            ret = 1;
        } else if (this.value < that.getValue()) {
            ret = -1;
        }
        return ret;
    }
}
