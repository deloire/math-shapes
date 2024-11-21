package tutorial.handlers;


import tutorial.TwoDFigures.Triangle;
import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class TriangleHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleTriangle() {
        System.out.println("\n(1)Perimeter (2)Area");
        System.out.print("What you want?: ");

        int triangleChoice = userChoice();
        if (triangleChoice == 1 || triangleChoice == 2) {
            double[] sides =  getTriangleSides();
            Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);

            if (triangleChoice == 1) {
                System.out.println("Triangle perimeter is: " + triangle.calculatePerimeter() + "\n");
            } else if (triangleChoice == 2) {
                System.out.println("Triangle area is: " + triangle.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!\n");
        }
    }

    private static double[] getTriangleSides() {
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + (i + 1) + " side: ");
            while (true) {
                try {
                    sides[i] = scanner.nextDouble();
                    if (sides[i] <= 0) throw new IllegalArgumentException("Side must be positive!");
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
