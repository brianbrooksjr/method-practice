package com.pluralsight;

public class CompareNumbers {

        public static void main(String[] args) {
            System.out.println(isEven(5)); // Should display false
            System.out.println(isEven(4)); // Should display true
            System.out.println(isPositive(5.0)); // Should display true
            System.out.println(isPositive(-3.0)); // Should display false
        }

        public static boolean isEven(int number) {
            return number % 2 == 0; // Returns true if the number is even
        }

        public static boolean isPositive(double number) {
            return number > 0; // Returns true if the number is positive
        }
    }
