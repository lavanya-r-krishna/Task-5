package com.task5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner reverse = new Scanner(System.in);

        //  user to enter a string
        System.out.print("Enter a string: ");
        String input = reverse.nextLine();

        // Initialize an empty string to store the reversed string
        String reversed = "";

        // Use a for loop to reverse the string
        for (int i = input.length() - 1; i >= 0; i--)
        {
            reversed += input.charAt(i);
        }

        // Output the reversed string
        System.out.println("Reversed string: " + reversed);
    }
}


