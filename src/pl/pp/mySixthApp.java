package pl.pp;

//7

public class mySixthApp {

    public static void main(String[] args) {
        int n = 20; // You can change this number to test other values

        // Measure time for iterative method
        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(n);
        long endIterative = System.nanoTime();
        System.out.println("Iterative factorial of " + n + " = " + resultIterative);
        System.out.println("Time taken (iterative): " + (endIterative - startIterative) + " ns");

        // Measure time for recursive method
        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(n);
        long endRecursive = System.nanoTime();
        System.out.println("Recursive factorial of " + n + " = " + resultRecursive);
        System.out.println("Time taken (recursive): " + (endRecursive - startRecursive) + " ns");
    }

    // Iterative method to calculate factorial
    static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}

