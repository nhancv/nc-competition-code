package codefights.interview.trees;

/**
 * https://codefights.com/interview-practice/task/oZXs4td52fsdWC9kR
 */
public class DeleteFromBST {

    Tree<Integer> deleteFromBST(Tree<Integer> t, int[] queries) {
        for (int q : queries) t = traverse(t, q);
        return t;
    }

    Tree<Integer> traverse(Tree<Integer> t, int query) {
        if (t == null) return null;
        if (t.value != query) {
            if (query < t.value) t.left = traverse(t.left, query);
            else t.right = traverse(t.right, query);
            return t;
        }
        if (t.left == null) return t.right;
        Tree<Integer> newRoot = t.left;
        Tree<Integer> parent = null;
        while (newRoot.right != null) {
            parent = newRoot;
            newRoot = newRoot.right;
        }
        if (parent != null) {
            parent.right = newRoot.left;
            newRoot.left = t.left;
        }
        newRoot.right = t.right;
        return newRoot;
    }

}
