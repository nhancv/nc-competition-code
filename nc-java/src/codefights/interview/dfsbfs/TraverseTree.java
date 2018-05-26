package codefights.interview.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://codefights.com/interview-practice/task/PhNPP45hZGNwpPchi
 */
public class TraverseTree {

    List traverseTree(Tree<Integer> t) {
        Queue<Tree<Integer>> active = new LinkedList<>();
        if (t != null) {
            active.add(t);
        }
        List<Integer> visited = new ArrayList<>();
        while (!active.isEmpty()) {
            Tree<Integer> x = active.poll();
            visited.add(x.value);
            if (x.left != null) {
                active.add(x.left);
            }
            if (x.right != null) {
                active.add(x.right);
            }
        }
        return visited;
    }


}
