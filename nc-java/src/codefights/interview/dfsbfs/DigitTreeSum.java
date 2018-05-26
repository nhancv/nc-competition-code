package codefights.interview.dfsbfs;

import java.util.ArrayList;
import java.util.List;

/**
 * https://codefights.com/interview-practice/task/2oxNWXTS8eWBzvnRB
 */
public class DigitTreeSum {

    long digitTreeSum(Tree<Integer> t) {
        List<Long> list = new ArrayList<>();
        traverse(t, list, 0);
        return list.stream().mapToLong(Long::longValue).sum();
    }

    void traverse(Tree<Integer> x, List<Long> list, long res) {
        if (x == null) return;

        if (x.left == null && x.right == null) {
            list.add(res * 10 + x.value);
        }

        traverse(x.left, list, res * 10 + x.value);
        traverse(x.right, list, res * 10 + x.value);
    }
}
