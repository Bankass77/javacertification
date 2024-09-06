package org.example.algortihme.interview.testInterviewQuestions;

/*
Longest Substring with At Least K Repeating Characters
Input: s = "aaabb", k = 3
Output: 3
Input: s = "ababbc", k = 2
Output: 5
"ababacb"
K = 3
Output = 0
///////////////////////////////////////////////
To solve the problem of finding the length of the longest substring where each character appears at least k times, a divide-and-conquer approach can be effective. Here's a breakdown of the approach:
Base Case: If the string is empty, return 0.
Frequency Count: Count the frequency of each character in the string.
Divide: If there exists a character whose frequency is less than k, then this character cannot be part of the desired substring. Split the string at this character and solve the problem recursively for each substring.
Conquer: For each substring that remains, check the longest valid substring recursively.
 */
public class LongestSubstringSolution {
    public int longestSubstring(String s, int k) {
        return helper(s, k, 0, s.length());
    }

    private int helper(String s, int k, int start, int end) {
        if (end - start < k) {
            return 0; // If the substring length is less than k, return 0
        }

        // Count frequency of each character in the current substring
        int[] count = new int[26];
        for (int i = start; i < end; i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the first character that doesn't appear at least k times
        for (int i = start; i < end; i++) {
            if (count[s.charAt(i) - 'a'] < k) {
                // Split the string at this character and solve for each part
                int left = helper(s, k, start, i);
                int right = helper(s, k, i + 1, end);
                return Math.max(left, right);
            }
        }

        // If all characters appear at least k times, return the length of the substring
        return end - start;
    }

    public static void main(String[] args) {
        LongestSubstringSolution sol = new LongestSubstringSolution();

        // Test cases
        System.out.println(sol.longestSubstring("aaabb", 3)); // Output: 3
        System.out.println(sol.longestSubstring("ababbc", 2)); // Output: 5
        System.out.println(sol.longestSubstring("ababacb", 3)); // Output: 0
    }
}

/*
Explanation:
·	The helper function takes four parameters: the string s, the integer k, the starting index start, and the ending index end.
·	It first checks if the length of the substring is less than k. If so, it returns 0 because there can't be a valid substring.
·	It then counts the frequency of each character in the current substring.
·	It loops through the substring, and if it finds a character whose frequency is less than k, it splits the string at that character and recursively computes the longest valid substring in both parts.
·	If all characters in the current substring appear at least k times, it returns the length of the substring.
Time Complexity:
·	The worst-case time complexity is O(nlog⁡n)O(n \log n)O(nlogn), where nnn is the length of the input string. This is because each recursive call splits the string at least once, and counting frequencies takes O(n)O(n)O(n)

 */