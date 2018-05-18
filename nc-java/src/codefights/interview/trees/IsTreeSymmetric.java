package codefights.interview.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://codefights.com/interview-practice/task/tXN6wQsTknDT6bNrf
 * Given a binary tree t, determine whether it is symmetric around its center, i.e. each side mirrors the other.
 */
public class IsTreeSymmetric {

    List<Integer> retrieval(Tree<Integer> t, boolean isLeft) {
        List<Integer> nodes = new ArrayList<>();
        if (t == null) return null;
        List<Tree<Integer>> visit = new ArrayList<>();
        visit.add(t);
        while (!visit.isEmpty()) {
            Tree<Integer> active = visit.get(0);
            visit.remove(0);
            if (active == null) {
                nodes.add(-1);
            } else {
                nodes.add(active.value);
                if (isLeft) {
                    visit.add(active.left);
                    visit.add(active.right);
                } else {
                    visit.add(active.right);
                    visit.add(active.left);
                }
            }
        }
        return nodes;
    }


    public boolean isTreeSymmetric(Tree<Integer> t) {
        if (t == null) return true;
        if (t.left == null && t.right == null) return true;
        if (t.left != null && t.right != null) {
            List<Integer> left = retrieval(t.left, true);
            List<Integer> right = retrieval(t.right, false);
            if (left.size() == right.size()) {
                for (int i = 0; i < left.size(); i++) {
                    if (!left.get(i).equals(right.get(i))) return false;
                }
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

}
