package codefights.interview.dfsbfs;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codefights.com/interview-practice/task/m9vC4ALaAeudkwRTF
 */
public class LargestValuesInTreeRows {

    int[] largestValuesInTreeRows(Tree<Integer> t) {
        Map<Integer, Integer> rows = new HashMap<>();
        int depth = traverse(t, rows, 0);
        int[] result = new int[depth];
        for (int i = 0; i < depth; ++i) {
            result[i] = rows.get(i);
        }
        return result;
    }

    int traverse(Tree<Integer> x, Map<Integer, Integer> rows, int d) {
        if (x == null) {
            return d;
        }
        if (rows.containsKey(d)) {
            rows.put(d, Math.max(rows.get(d), x.value));
        } else {
            rows.put(d, x.value);
        }

        int dLeft = traverse(x.left, rows, d + 1);
        int dRight = traverse(x.right, rows, d + 1);
        return Math.max(dLeft, dRight);
    }
}
