package com.task5;

public class Palindrome {
    public static void main(String[] args) {
        // Example string
        String str = "malayalam";

        // Call the method to check if the string is a palindrome
        boolean result = isPalindrome(str);

        // Print the result
        if (result) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();

        // Check characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

