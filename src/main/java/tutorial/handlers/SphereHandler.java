package tutorial.handlers;

import tutorial.ThreeDFigures.Sphere;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class SphereHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleSphere() {
        System.out.println("\n(1)Volume (2)Area");
        System.out.print("What you want?: ");

        int sphereChoice = userChoice();
        if (sphereChoice == 1 || sphereChoice == 2) {
            double[] radius = getSphereRadius();
            Sphere sphere = new Sphere(radius[0]);

            if (sphereChoice == 1) {
                System.out.println("Sphere volume is: " + sphere.calculateVolume() + "\n");
            } else if (sphereChoice == 2) {
                System.out.println("Sphere area is: " + sphere.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!\n");
        }
    }

    private static double[] getSphereRadius() {
        double[] radius = new double[1];

        System.out.print("Enter sphere radius: ");
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
