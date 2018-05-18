package codefights.interview.trees;

/**
 * https://codefights.com/interview-practice/task/TG4tEMPnAc3PnzRCs
 * Given a binary tree t and an integer s, determine whether there is a root to leaf path in t such that the sum of vertex values equals s.
 */
public class HasPathWithGivenSum {

    boolean retrieval(Tree<Integer> t, int s) {
        if (t == null) return false;
        if (t.left == null && t.right == null) return s == t.value;
        return retrieval(t.left, s - t.value) | retrieval(t.right, s - t.value);
    }

    boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
        if (t == null && s == 0) return true;
        return retrieval(t, s);
    }

}
