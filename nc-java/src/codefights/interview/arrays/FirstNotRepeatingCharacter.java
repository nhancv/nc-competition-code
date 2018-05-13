package codefights.interview.arrays;

/**
 * https://codefights.com/interview-practice/task/uX5iLwhc6L5ckSyNC
 * Note: Write a solution that only iterates over the string once and uses O(1) additional memory, since this is what you would be asked to do during a real interview.
 * <p>
 * Given a string s, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
 * <p>
 * Example
 * <p>
 * For s = "abacabad", the output should be
 * firstNotRepeatingCharacter(s) = 'c'.
 * <p>
 * There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
 * <p>
 * For s = "abacabaabacaba", the output should be
 * firstNotRepeatingCharacter(s) = '_'.
 * <p>
 * There are no characters in this string that do not repeat.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string s
 * <p>
 * A string that contains only lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ s.length ≤ 105.
 * <p>
 * [output] char
 * <p>
 * The first non-repeating character in s, or '_' if there are no characters that do not repeat.
 */
public class FirstNotRepeatingCharacter {
    char firstNotRepeatingCharacter(String s) {
        int count[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 97]++;
        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i) - 97] == 1)
                return s.charAt(i);
        return '_';
    }
}
