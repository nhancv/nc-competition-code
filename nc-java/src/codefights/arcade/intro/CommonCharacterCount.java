package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-3/JKKuHJknZNj4YGL32
 * Given two strings, find the number of common characters between them.
 * <p>
 * Example
 * <p>
 * For s1 = "aabcc" and s2 = "adcaa", the output should be
 * commonCharacterCount(s1, s2) = 3.
 * <p>
 * Strings have 3 common characters - 2 "a"s and 1 "c".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string s1
 * <p>
 * A string consisting of lowercase latin letters a-z.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ s1.length ≤ 15.
 * <p>
 * [input] string s2
 * <p>
 * A string consisting of lowercase latin letters a-z.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ s2.length ≤ 15.
 * <p>
 * [output] integer
 */
public class CommonCharacterCount {
    public int commonCharacterCount(String s1, String s2) {
        int length = 200;
        int[] chars1 = new int[length];
        int[] chars2 = new int[length];
        for (int i = 0; i < s1.length(); i++) {
            chars1[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            chars2[s2.charAt(i)]++;
        }

        int res = 0;
        for (int i = 0; i < length; i++) {
            if (chars1[i] > 0 && chars2[i] > 0) {
                res += Math.min(chars1[i], chars2[i]);
            }
        }
        return res;
    }
}
