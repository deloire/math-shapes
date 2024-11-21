package tutorial.handlers;


import tutorial.TwoDFigures.Rectangle;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class RectangleHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleRectangle() {
        System.out.println("\n(1)Perimeter (2)Area");
        System.out.print("What you want?: ");

        int rectangleChoice = userChoice();
        if (rectangleChoice == 1 || rectangleChoice == 2) {
            double[] sides = getRectangleSides();
            Rectangle rectangle = new Rectangle(sides[0], sides[1]);

            if (rectangleChoice == 1) {
                System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter() + "\n");
            } else if (rectangleChoice == 2) {
                System.out.println("Rectangle area: " + rectangle.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!");
        }
    }

    private double[] getRectangleSides() {
        double[] sides = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter " + (i + 1) + " side: ");
            while(true) {
                try {
                    sides[i] = scanner.nextDouble();
                    if (sides[i] <= 0) throw new IllegalArgumentException("Side most be positive!");
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter correct number!");
                    scanner.next();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return sides;
    }


}
