package tutorial.TwoDFigures;

import tutorial.TwoDimensionalFigure;

public class Triangle implements TwoDimensionalFigure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || !isTriangle(a, b, c)) {
            throw new IllegalArgumentException("Such a triangle doesn't exist!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter()/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}