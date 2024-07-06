package com.task5;

import java.util.Scanner;

public class AnnaUniversity {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // To enter the marks
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        // Grade based on the input marks
        String grade;
        if (marks > 100) {
            grade = "Invalid input";
        } else if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else if (marks >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        // Print the grade
        System.out.println(grade);

        // Close the scanner
        scanner.close();
    }
}



