/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.majorelement;
import java.util.*;

public class Majorelement {

    // Function to find elements appearing more than ⌊ n/3 ⌋ times in an array
    public static List<Integer> majorElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int c1 = 0, c2 = 0, count1 = 0, count2 = 0;

        // Voting process to find potential candidates
        for (int num : nums) {
            if (num == c1) count1++;
            else if (num == c2) count2++;
            else if (count1 == 0) { c1 = num; count1 = 1; }
            else if (count2 == 0) { c2 = num; count2 = 1; }
            else { count1--; count2--; }
        }

        // Reset counts for the second pass
        count1 = count2 = 0;

        // Second pass to count occurrences of potential candidates
        for (int num : nums) {
            if (num == c1) count1++;
            else if (num == c2) count2++;
        }

        // Check if candidates appear more than ⌊ n/3 ⌋ times
        if (count1 > nums.length / 3) result.add(c1);
        if (count2 > nums.length / 3) result.add(c2);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array elements
        System.out.print("Enter the array elements (separate by space): ");
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        // Call the majorElement method and print the result
        System.out.println("Elements appearing more than ⌊ n/3 ⌋ times: " + majorElement(nums));

        // Close the scanner
        scanner.close();
    }
}
/*
1.Initialization:
Two potential candidates (c1 and c2) are initialized to 0.
Counters (count1 and count2) for the candidates are initialized to 0.

2.Voting Process (First Pass):
The code iterates through the array (nums).
If the current number matches c1 or c2, the respective counter is incremented.
If both counters are 0, the current number becomes a candidate, and the counter is set to 1.
If both counters are non-zero, both counters are decremented (voting out candidates).

3.Second Pass:
The code resets counters and iterates through the array again.
Counts occurrences of potential candidates (c1 and c2).

4.Checking Candidates:
If the count of c1 is greater than [ n/3 ], add c1 to the result.
If the count of c2 is greater than [ n/3 ], add c2 to the result.

5.Result:
The function returns the result, which contains elements appearing more than ⌊ n/3 ⌋ times.

Reasoning:
The algorithm uses the Boyer-Moore Majority Vote algorithm to find potential candidates in a concise and efficient way. The key idea is to vote out pairs of different elements, leaving potential candidates that might appear more than ⌊ n/3 ⌋ times.

The two-pass approach ensures the correctness of the counts for potential candidates. The final result is determined based on the counts of potential candidates.

Overall, the algorithm reduces the problem to finding at most two potential candidates efficiently, resulting in a linear time complexity solution.
*/

