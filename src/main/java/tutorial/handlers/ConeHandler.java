package tutorial.handlers;


import tutorial.ThreeDFigures.Cone;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class ConeHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleCone () {
        System.out.println("\n(1)Volume (2)Area");
        System.out.print("What you want?: ");

        int coneChoice = userChoice();
        if (coneChoice == 1 || coneChoice == 2) {
            double[] coneElements = getConeElements();
            Cone cone  = new Cone(coneElements[0], coneElements[1]);

            if (coneChoice == 1) {
                System.out.println("Cone volume is: " + cone.calculateVolume() + "\n");
            } else if (coneChoice == 2) {
                System.out.println("Cone area is: " + cone.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!");
        }

    }

    private static double[] getConeElements() {
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
