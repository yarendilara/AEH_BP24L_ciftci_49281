public class myFifthApp {

    public static void main(String[] args) {
        // Example usage of the method with sample inputs
        repeatSymbol('@', 4, 5);
    }

    // Prints a block of characters in a grid format
    // Parameters:
    // - symbol: the character to be printed
    // - width: number of times the symbol is printed in a single line
    // - height: number of lines to print
    public static void repeatSymbol(char symbol, int width, int height) {

        for (int row = 0; row < height; row++) {

            for (int col = 0; col < width; col++) {
                System.out.print(symbol);
            }

            System.out.println(); // move to next line after each row
        }
    }
}

