package codefights.interview.hashtables;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codefights.com/interview-practice/task/3PcnSKuRkqzp8F6BN/description
 * Given an array strings, determine whether it follows the sequence given in the patterns array. In other words, there should be no i and j for which strings[i] = strings[j] and patterns[i] ≠ patterns[j] or for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].
 * <p>
 * Example
 * <p>
 * For strings = ["cat", "dog", "dog"] and patterns = ["a", "b", "b"], the output should be
 * areFollowingPatterns(strings, patterns) = true;
 * For strings = ["cat", "dog", "doggy"] and patterns = ["a", "b", "b"], the output should be
 * areFollowingPatterns(strings, patterns) = false.
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.string strings
 * <p>
 * An array of strings, each containing only lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ strings.length ≤ 105,
 * 1 ≤ strings[i].length ≤ 10.
 * <p>
 * [input] array.string patterns
 * <p>
 * An array of pattern strings, each containing only lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * patterns.length = strings.length,
 * 1 ≤ patterns[i].length ≤ 10.
 * <p>
 * [output] boolean
 * <p>
 * Return true if strings follows patterns and false otherwise.
 */
public class AreFollowingPatterns {

    boolean areFollowingPatterns(String[] strings, String[] patterns) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                if (!map.get(strings[i]).equals(patterns[i])) return false;
            } else if (map.containsValue(patterns[i])) {
                return false;
            }
            map.put(strings[i], patterns[i]);
        }
        return true;
    }

}
