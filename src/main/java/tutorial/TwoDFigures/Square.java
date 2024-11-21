package tutorial.TwoDFigures;

import tutorial.TwoDimensionalFigure;

public class Square implements TwoDimensionalFigure {

    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double calculateArea() {
        return Math.pow(squareSide, 2);
    }

    @Override
    public double calculatePerimeter() {
        return squareSide*4;
    }
}
