package codefights.interview.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargestInBST {

    public int kthLargestInBST(Tree<Integer> t, int k) {
        List<Integer> nodes = new ArrayList<>();
        List<Tree<Integer>> visited = new ArrayList<>();
        visited.add(t);
        while(visited.size()>0){
            Tree<Integer> active = visited.get(0);
            visited.remove(0);
            nodes.add(active.value);
            if(active.left!=null)  visited.add(active.left);
            if(active.right!=null) visited.add(active.right);
        }
        Collections.sort(nodes);
        System.out.println(nodes);
        return nodes.get(k-1);
    }

}
