package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Accept user input for first and last name
        String firstName = promptForString(scanner, "Enter first name: ");
        String lastName = promptForString(scanner, "Enter last name: ");

        // Format the name and print it
        String formattedName = formatName(firstName, lastName);
        System.out.println(formattedName); // Print the formatted name

        // Close the scanner
        scanner.close();
    }

    public static String promptForString(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static String formatName(String first, String last) {
        return last + ", " + first; // Return the name "Last, First" format
    }
}
