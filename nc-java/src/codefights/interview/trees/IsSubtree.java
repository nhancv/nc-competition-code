package codefights.interview.trees;

/**
 * https://codefights.com/interview-practice/task/mDpAJnDQkJqaYYsCg
 * Given two binary trees t1 and t2, determine whether the second tree is a subtree of the first tree. A subtree for vertex v in a binary tree t is a tree consisting of v and all its descendants in t. Determine whether or not there is a vertex v (possibly none) in tree t1 such that a subtree for vertex v (possibly empty) in t1 equals t2.
 */
public class IsSubtree {

    boolean traverse(Tree<Integer> t1, Tree<Integer> t2) {
        if(t1 != null && t2 == null) return false;
        if(t2 != null && t1 == null) return false;
        if(t1 == null) return true;
        if(t1.value.intValue() == t2.value.intValue()) {
            return traverse(t1.left, t2.left) && traverse(t1.right, t2.right);
        } else {
            return traverse(t1.left, t2) || traverse(t1.right, t2);
        }
    }

    public boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
        if(t2 == null) return true;
        return traverse(t1, t2);
    }


}
