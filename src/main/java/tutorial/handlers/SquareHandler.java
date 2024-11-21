package tutorial.handlers;

import tutorial.TwoDFigures.Square;

import java.util.InputMismatchException;
import java.util.Scanner;

import static tutorial.Main.userChoice;

public class SquareHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public void handleSquare() {
        System.out.println("\n(1)Perimeter (2)Area");
        System.out.print("What you want?: ");

        int squareChoice = userChoice();
        if (squareChoice == 1 || squareChoice == 2) {
            double[] side = getSquareSide();
            Square square = new Square(side[0]);

            if (squareChoice == 1) {
                System.out.println("Square perimeter is: " + square.calculatePerimeter() + "\n");
            } else if (squareChoice == 2) {
                System.out.println("Square area is: " + square.calculateArea() + "\n");
            }
        } else {
            System.out.println("Follow instructions!");
        }
    }

    private double[] getSquareSide() {
        double[] side = new double[1];

        System.out.print("Enter square side: ");
        while (true) {
            try {
                side[0] = scanner.nextDouble();
                if (side[0] <= 0) throw new IllegalArgumentException("Side must be positive!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Enter correct number!");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        return side;
    }

}
