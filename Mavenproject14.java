/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject14;
import java.util.*;
/**
 *
 * @author hp
 */
public class Mavenproject14 {




    public static int lengthLastWord(String s) {
        // Split the string into words
        String[] wrds = s.split("\\s+");

        // Check if there are any words in the string
        if (wrds.length == 0) {
            return 0;
        }

        // Return the length of the last word
        return wrds[wrds.length - 1].length();
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the lengthOfLastWord method and print the result
        int res = lengthLastWord(input);
        System.out.println("Length of the last word: " + res);

        // Close the scanner
        scanner.close();
    }
}
/*1.String Splitting:
The method takes a string s as input.
It uses the split("\\s+") method to split the string into an array of words (wrds). The regular expression "\\s+" indicates one or more whitespace characters as the delimiter.

2.Checking for Words:
It checks if there are any words in the string by examining the length of the wrds array. If the array is empty, it means there are no words, and the method returns 0.

3.Returning Length of Last Word:
If there are words in the array, the method returns the length of the last word. It retrieves the last element of the array (wrds[wrds.length - 1]) and calculates its length using .length().

Reasoning:
The purpose of the code is to find and print the length of the last word in a given string. It achieves this by splitting the string into words and extracting the length of the last word.

The regular expression \\s+ is used to handle cases where there might be multiple spaces between words. The check for the presence of words ensures that the method doesn't attempt to access an invalid index in the array.

The Scanner is used to interactively take input from the user. The provided logic is concise and effective for solving the specified problem.*/
