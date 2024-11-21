package tutorial;

import tutorial.handlers.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            int choice = userChoice();
            processChoice(choice);
        }

    }

    private static void displayMenu() {

        System.out.println("1. Triangle\n" +
                "2. Square\n" +
                "3. Rectangle\n" +
                "4. Circle\n" +
                "5. Cone\n" +
                "6. Cylinder\n" +
                "7. Sphere\n" +
                "8. Exit");

        System.out.print("Your choice: ");

    }

    public static int userChoice() {
        while(true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid number!");
                scanner.next();
            }
        }
    }

    private static void processChoice(int choice) {
        switch (choice) {
            case 1:
                new TriangleHandler().handleTriangle();
                break;
            case 2:
                new SquareHandler().handleSquare();
                break;
            case 3:
                new RectangleHandler().handleRectangle();
                break;
            case 4:
                new CircleHandler().handleCircle();
                break;
            case 5:
                new ConeHandler().handleCone();
                break;
            case 6:
                new CylinderHandler().handleCylinder();
                break;
            case 7:
                new SphereHandler().handleSphere();
                break;
            case 8:
                System.out.println("Goodbye!");
                System.exit(0);
            default:
                System.out.println("Please select a correct option!");
        }
    }
}