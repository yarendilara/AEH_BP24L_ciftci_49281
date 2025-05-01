import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // Part 1: Working with number x
        int x = 10;
        System.out.println("Number x = " + x);
        System.out.println("Double of x = " + (x * 2));
        System.out.println("x squared = " + (x * x));

        // Part 2: Age to seconds conversion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age in years: ");
        int age = scanner.nextInt();

        // Convert age to seconds (years * 365 * 24 * 60 * 60)
        long ageInSeconds = (long) age * 365 * 24 * 60 * 60;
        System.out.println("Your age in seconds = " + ageInSeconds);

        scanner.close();
    }
}