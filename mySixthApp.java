public class mySixthApp {

    public static void main(String[] args) {
        int number = 10;

        long startIterative = System.nanoTime();
        long resultIterative = factorialIterative(number);
        long endIterative = System.nanoTime();

        long startRecursive = System.nanoTime();
        long resultRecursive = factorialRecursive(number);
        long endRecursive = System.nanoTime();

        System.out.println("Factorial of " + number + " (iterative): " + resultIterative);
        System.out.println("Time taken (iterative): " + (endIterative - startIterative) + " ns");

        System.out.println("Factorial of " + number + " (recursive): " + resultRecursive);
        System.out.println("Time taken (recursive): " + (endRecursive - startRecursive) + " ns");
    }

    // Calculates factorial using a loop
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Calculates factorial using recursion
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}

