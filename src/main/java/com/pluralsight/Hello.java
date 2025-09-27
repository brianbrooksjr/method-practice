package com.pluralsight;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Call methods
        sayHello();
        sayGoodbye();
        sayGoodMorning();

        // Close the scanner
        scanner.close();
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void sayGoodMorning() {
        System.out.println("Good morning!");
    }
}
