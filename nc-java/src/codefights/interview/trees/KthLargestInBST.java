package codefights.interview.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargestInBST {


    int mark = Integer.MAX_VALUE, res = mark, s;

    void traverse(Tree<Integer> t, int k) {
        if (t == null) return;
        //Check left
        traverse(t.left, k);
        //Check mid
        if (s == k - 1 && res == mark) {
            res = t.value;
            return;
        }
        s++;
        //Check right
        traverse(t.right, k);
    }

    public int kthLargestInBST(Tree<Integer> t, int k) {
        traverse(t, k);
        return res;
    }

}
