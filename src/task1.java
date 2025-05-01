import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        //This is a line comment
        Scanner scanner = new Scanner(System.in);
        /*
         * This is a block comment
         * It can contain multiple lines
         * Just like here
         */
        System.out.println("Please enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Please enter your forename:");
        String forename = scanner.nextLine();

        scanner.close();

        System.out.println("Welcome " + forename + " " + surname);
    }
}