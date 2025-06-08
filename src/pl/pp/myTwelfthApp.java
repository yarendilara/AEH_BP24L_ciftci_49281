package pl.pp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Path inputPath = getValidInputFile(scanner);
            Path outputPath = getOutputPath(scanner);

            processFiles(inputPath, outputPath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    private static Path getValidInputFile(Scanner scanner) {
        while (true) {
            System.out.print("Enter the path to the input text file: ");
            String inputFile = scanner.nextLine();
            Path inputPath = Paths.get(inputFile);

            if (!Files.exists(inputPath)) {
                System.out.println("Error: File not found. Please try again.");
                continue;
            }

            if (!Files.isRegularFile(inputPath)) {
                System.out.println("Error: The path must be a regular file, not a directory.");
                continue;
            }

            return inputPath;
        }
    }

    private static Path getOutputPath(Scanner scanner) {
        while (true) {
            System.out.print("Enter the path for the output text file: ");
            String outputFile = scanner.nextLine();
            Path outputPath = Paths.get(outputFile);

            if (Files.exists(outputPath)) {
                System.out.print("Warning: Output file already exists. Overwrite? (y/n): ");
                String response = scanner.nextLine().trim().toLowerCase();
                if (!response.equals("y")) {
                    continue;
                }
            }

            return outputPath;
        }
    }

    private static void processFiles(Path inputPath, Path outputPath) throws IOException {
        List<String> lines = Files.readAllLines(inputPath);
        int lineCount = lines.size();

        System.out.println("The number of lines in the input file: " + lineCount);

        String result = "File name: " + inputPath.getFileName() +
                "\nNumber of lines: " + lineCount;

        Files.write(outputPath, result.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Results successfully written to: " + outputPath);
    }
}