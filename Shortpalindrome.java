/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.shortpalindrome;
import java.util.*;
/**
 *
 * @author hp
 */
public class Shortpalindrome {



    public static String shortestpalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }

        if (i == s.length()) {
            return s;  // The string is already a palindrome
        }

        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();

        return prefix + shortestpalindrome(s.substring(0, i)) + suffix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Shortest palindrome: " + shortestpalindrome(inputString));

        scanner.close();
    }
}
/*
1.Initialization:

i and j are initialized to the start and end of the string, respectively.
2.Finding the Common Suffix:

The while loop is used to find the common suffix of the string. It increments i if characters at positions i and j are equal, moving towards the center of the string.
3.Handling Already Palindrome Case:

If i reaches the end of the string, it means the entire string is a palindrome. In this case, the original string is returned as the result.
4.Creating Suffix and Prefix:

The suffix is obtained from the remaining part of the string starting from position i.
The prefix is created by reversing the suffix.
5.Recursive Call:

The function is called recursively on the substring from the beginning of the string to position i.
6.Concatenation:

The final result is obtained by concatenating the prefix, the recursive result, and the suffix.
*/