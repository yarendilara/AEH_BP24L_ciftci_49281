package pl.pp;

import java.util.Scanner;

public class DayConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of days (0 or negative to exit): ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Exiting...");
                break;
            }

            int weeks = days / 7;
            int remainderDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainderDays + " days.");
        }

        scanner.close();
    }
}
