package codefights.arcade.intro;

import java.util.ArrayList;

/**
 * https://codefights.com/arcade/intro/level-3/fzsCQGYbxaEcTr2bL
 * Given an array of strings, return another array containing all of its longest strings.
 * <p>
 * Example
 * <p>
 * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 * allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.string inputArray
 * <p>
 * A non-empty array.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ inputArray.length ≤ 10,
 * 1 ≤ inputArray[i].length ≤ 10.
 * <p>
 * [output] array.string
 * <p>
 * Array of the longest strings, stored in the same order as in the inputArray.
 */
public class AllLongestString {
    String[] allLongestStrings(String[] inputArray) {
        ArrayList<String> res = new ArrayList<>();
        int[] index = new int[inputArray.length];
        int max = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int l = inputArray[i].length();
            if (max < l) max = l;
            index[i] = l;
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] == max) {
                res.add(inputArray[i]);
            }
        }
        return res.toArray(new String[0]);
    }
}
