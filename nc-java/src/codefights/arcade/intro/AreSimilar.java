package codefights.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://codefights.com/arcade/intro/level-4/xYXfzQmnhBvEKJwXP
 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
 * <p>
 * Given two arrays a and b, check whether they are similar.
 * <p>
 * Example
 * <p>
 * For a = [1, 2, 3] and b = [1, 2, 3], the output should be
 * areSimilar(a, b) = true.
 * <p>
 * The arrays are equal, no need to swap any elements.
 * <p>
 * For a = [1, 2, 3] and b = [2, 1, 3], the output should be
 * areSimilar(a, b) = true.
 * <p>
 * We can obtain b from a by swapping 2 and 1 in b.
 * <p>
 * For a = [1, 2, 2] and b = [2, 1, 1], the output should be
 * areSimilar(a, b) = false.
 * <p>
 * Any swap of any two elements either in a or in b won't make a and b equal.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer a
 * <p>
 * Array of integers.
 * <p>
 * Guaranteed constraints:
 * 3 ≤ a.length ≤ 105,
 * 1 ≤ a[i] ≤ 1000.
 * <p>
 * [input] array.integer b
 * <p>
 * Array of integers of the same length as a.
 * <p>
 * Guaranteed constraints:
 * b.length = a.length,
 * 1 ≤ b[i] ≤ 1000.
 * <p>
 * [output] boolean
 * <p>
 * true if a and b are similar, false otherwise.
 */
public class AreSimilar {

    boolean areSimilar(int[] a, int[] b) {
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) diff.add(i);
        }
        if (diff.size() > 2) return false;
        if (diff.size() == 0) return true;
        int i = diff.get(0);
        int j = diff.get(1);
        return a[i] == b[j] && b[i] == a[j];
    }

}
