import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }
        } while (true);

        scanner.close();
    }
}
