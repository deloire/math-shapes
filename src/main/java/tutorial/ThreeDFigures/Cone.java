package tutorial.ThreeDFigures;

import tutorial.ThreeDimensionalFigure;

public class Cone implements ThreeDimensionalFigure {

    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    private double calculateSlantHeight() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }


    @Override
    public double calculateVolume() {
        return 1.0/3 * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2) * (radius + calculateSlantHeight());
    }

}
