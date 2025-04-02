package pl.pp;// Task 1: Sum of squares in range
import java.util.Scanner;

public class myForthApp {
    public static void main(String[] args) {
        sumOfSquares();
        calculator();
    }

    public static void sumOfSquares() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
            int firstSquare = lower * lower;
            int lastSquare = upper * upper;

            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.println("The sums of the squares from " + firstSquare + " to " + lastSquare + " is " + sum);
        }
    }

    // Task 2: Simple calculator
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSimple Calculator Menu:");
            System.out.println("a) Add");
            System.out.println("b) Subtract");
            System.out.println("c) Multiply");
            System.out.println("d) Divide");
            System.out.println("q) Quit");

            System.out.print("Choose an option: ");
            String choice = scanner.next().toLowerCase();

            if (choice.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!choice.matches("[abcd]") ) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }

            try {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case "a":
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case "b":
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case "c":
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case "d":
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Result: " + (num1 / num2));
                        }
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numeric values.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}