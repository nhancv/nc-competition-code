package codefights.arcade.intro;

import java.util.HashMap;

/**
 * https://codefights.com/arcade/intro/level-4/Xfeo7r9SBSpo3Wico
 * Given a string, find out if its characters can be rearranged to form a palindrome.
 * <p>
 * Example
 * <p>
 * For inputString = "aabb", the output should be
 * palindromeRearranging(inputString) = true.
 * <p>
 * We can rearrange "aabb" to make "abba", which is a palindrome.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string inputString
 * <p>
 * A string consisting of lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ inputString.length ≤ 50.
 * <p>
 * [output] boolean
 * <p>
 * true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 */
public class PalindromeRearranging {

    boolean palindromeRearranging(String inputString) {
        HashMap<Character, Integer> charDict = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character c = inputString.charAt(i);
            if (!charDict.containsKey(c)) {
                charDict.put(c, 1);
            } else {
                charDict.put(c, charDict.get(c) + 1);
            }
        }

        int odd = 0;
        for (Integer integer : charDict.values()) {
            if (integer % 2 > 0) odd++;
        }

        return odd < 2;
    }


}
