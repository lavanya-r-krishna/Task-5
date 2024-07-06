package com.task5;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
    	
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // To enter a number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Use nested loops to print the pattern
        for (int i = 1; i <= n; i++)
        {
        	// Outer loop for rows
            for (int j = 1; j <= i; j++)
            
            { // Inner loop for columns
                System.out.print(j); // Print numbers in each row
            }
            
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}

