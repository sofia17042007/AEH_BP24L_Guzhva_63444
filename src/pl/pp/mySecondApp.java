package pl.pp;

import java.util.Scanner;

public class mySecondApp {
    public void main(String[] args) {
        double x = 10;
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Enter two numbers separated by the Enter key");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));

        ageTask();
    }

    void ageTask() {
                    // Task 1: Operations with x
                    int x = 10;
                    int doubleX = x * 2;
                    int squareX = x * x;

                    System.out.println("x = " + x);
                    System.out.println("Double of x = " + doubleX);
                    System.out.println("Square of x = " + squareX);

                    // Task 2: Convert age to seconds
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter your age in years:");
                    int age = scanner.nextInt();

                    long ageInSeconds = (long) age * 365 * 24 * 60 * 60;
                    System.out.println("My age in seconds: " + ageInSeconds);
                }
}
