package tutorial.handlers;

import tutorial.TwoDFigures.Circle;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class CircleHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleCircle() {
        System.out.println("\n(1)Perimeter (2)Area");
        System.out.print("What you want?: ");

        int circleChoice = userChoice();
        if (circleChoice == 1 || circleChoice == 2) {
            double[] radius = getCircleRadius();
            Circle circle = new Circle(radius[0]);

            if (circleChoice == 1) {
                System.out.println("Circle perimeter is: " + circle.calculatePerimeter() + "\n");
            } else if (circleChoice == 2) {
                System.out.println("Circle area is: " + circle.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!\n");
        }
    }

    private static double[] getCircleRadius() {
        double[] radius = new double[1];

        System.out.print("Enter circle radius: ");
        while (true) {
            try {
                radius[0] = scanner.nextDouble();
                if (radius[0] <= 0) throw new IllegalArgumentException("Radius must be positive!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter correct number!");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return radius;
    }

}
