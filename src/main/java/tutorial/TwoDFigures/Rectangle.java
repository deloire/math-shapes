package tutorial.TwoDFigures;

import tutorial.TwoDimensionalFigure;

public class Rectangle implements TwoDimensionalFigure {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
