package com.task5;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

          int n =5;

        // Loop to print the pattern
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            	{
                // Print '*' for the first and last columns and for the middle row
                if (j == 0 || j == n - 2 || i == n )
                	{
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}
