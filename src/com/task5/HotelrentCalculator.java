package com.task5;

import java.util.Scanner;

public class HotelrentCalculator
{
    public static void main(String[] args) 
    {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Enter the month number, room rent per day, and number of days stayed
        System.out.print("Enter the month number: ");
        
        int month = scanner.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        
        double roomRentPerDay = scanner.nextDouble();
        
        System.out.print("Enter the number of days stayed: ");
        
        int numberOfDays = scanner.nextInt();

        // Initialize the final room rent to base room rent
        double finalRoomRentPerDay = roomRentPerDay;

        // Use a switch construct to check if the month is in the peak season
        switch (month)
        {
            case 1:  // April
            case 2:  // May
            case 3:  // June
            case 4: // November
            case 5: // December
            	
                finalRoomRentPerDay = roomRentPerDay * 1.20; // Increase rent by 20%
                break;
            default:
                // No change in rent for non-peak months
                break;
        }

        // Calculate the total rent
        double totalTariff = finalRoomRentPerDay * numberOfDays;

     // Print the total rent with 2 decimal places
        System.out.printf("The hotel tariff to be paid is: %.2f%n", totalTariff);

        // Close the scanner
        scanner.close();
    }
}


