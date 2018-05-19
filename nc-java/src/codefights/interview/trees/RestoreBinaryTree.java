package codefights.interview.trees;

/**
 * https://codefights.com/interview-practice/task/AaWaYxi8gjtbqgp2M
 */
public class RestoreBinaryTree {

    Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
        return traverse(0, 0, preorder.length - 1, inorder, preorder);
    }

    Tree<Integer> traverse(int p, int s, int e, int[] inorder, int[] preorder) {
        if (p > preorder.length - 1 || s > e) return null;
        Tree<Integer> root = new Tree<>(preorder[p]);
        for (int i = s; i <= e; i++) {
            if (inorder[i] == root.value) {
                root.left = traverse(p + 1, s, i - 1, inorder, preorder);
                root.right = traverse(p + i - s + 1, i + 1, e, inorder, preorder);
                break;
            }
        }
        return root;
    }

}
