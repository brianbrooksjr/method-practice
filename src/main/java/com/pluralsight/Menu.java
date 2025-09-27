package com.pluralsight;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Call displayMenu twice to demonstrate reusability
        displayMenu();
        displayMenu();

        // Close the scanner
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
    }
}
