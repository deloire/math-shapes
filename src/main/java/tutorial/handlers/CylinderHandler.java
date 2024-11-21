package tutorial.handlers;

import tutorial.ThreeDFigures.Cone;
import tutorial.ThreeDFigures.Cylinder;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class CylinderHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleCylinder() {
        System.out.println("\n(1)Volume (2)Area");
        System.out.print("What you want?: ");

        int cylinderChoice = userChoice();
        if (cylinderChoice == 1 || cylinderChoice == 2) {
            double[] coneElements = getCylinderElements();
            Cylinder cylinder = new Cylinder(coneElements[0], coneElements[1]);

            if (cylinderChoice == 1) {
                System.out.println("Cylinder volume is: " + cylinder.calculateVolume() + "\n");
            } else if (cylinderChoice == 2) {
                System.out.println("Cylinder area is: " + cylinder.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!");
        }

    }

    private static double[] getCylinderElements() {
        double[] elements = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            while (true) {
                try {
                    elements[i] = scanner.nextDouble();
                    if (elements[i] <= 0) throw new IllegalArgumentException("Elements must be positive!");
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Enter correct number!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return elements;
    }
}
