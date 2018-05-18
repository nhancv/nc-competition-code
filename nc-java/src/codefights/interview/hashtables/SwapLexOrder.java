package codefights.interview.hashtables;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * https://codefights.com/interview-practice/task/5vXzdE9yzjsoMZ9sk
 * Given a string str and array of pairs that indicates which indices in the string can be swapped, return the lexicographically largest string that results from doing the allowed swaps. You can swap indices any number of times.
 * <p>
 * Example
 * <p>
 * For str = "abdc" and pairs = [[1, 4], [3, 4]], the output should be
 * swapLexOrder(str, pairs) = "dbca".
 * <p>
 * By swapping the given indices, you get the strings: "cbda", "cbad", "dbac", "dbca". The lexicographically largest string in this list is "dbca".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string str
 * <p>
 * A string consisting only of lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ str.length ≤ 104.
 * <p>
 * [input] array.array.integer pairs
 * <p>
 * An array containing pairs of indices that can be swapped in str (1-based). This means that for each pairs[i], you can swap elements in str that have the indices pairs[i][0] and pairs[i][1].
 * <p>
 * Guaranteed constraints:
 * 0 ≤ pairs.length ≤ 5000,
 * pairs[i].length = 2.
 * <p>
 * [output] string
 */
public class SwapLexOrder {

    public String swapLexOrder(String str, int[][] pairs) {
        if (pairs.length == 0) return str;
        TreeMap<Integer, Set<Integer>> corr = new TreeMap<>();
        TreeSet<Integer> nodes = new TreeSet<>();

        for (int i = 0; i < pairs.length; i++) {
            int p1 = pairs[i][0] - 1;
            int p2 = pairs[i][1] - 1;
            Set<Integer> link1 = corr.get(p1);
            if (link1 == null) link1 = new HashSet<>();
            link1.add(p2);
            corr.put(p1, link1);
            Set<Integer> link2 = corr.get(p2);
            if (link2 == null) link2 = new HashSet<>();
            link2.add(p1);
            corr.put(p2, link2);

            nodes.add(p1);
            nodes.add(p2);
        }

        char c[] = str.toCharArray();
        while (nodes.size() > 0) {
            Queue<Integer> nodeVisit = new PriorityQueue<>();
            nodeVisit.add(nodes.pollFirst());

            TreeSet<Integer> group = new TreeSet<>();
            while (!nodeVisit.isEmpty()) {
                Integer n = nodeVisit.poll();
                group.add(n);
                for (Integer integer : corr.get(n)) {
                    if (nodes.contains(integer)) {
                        nodeVisit.add(integer);
                        nodes.remove(integer);
                    }
                }
            }

            List<Character> s = new ArrayList<>();
            for (Integer integer : group) {
                s.add(c[integer]);
            }
            Collections.sort(s, Collections.<Character>reverseOrder());
            for (Integer integer : group) {
                Character temp = s.get(0);
                s.remove(0);
                if (temp != null) {
                    c[integer] = temp;
                }
            }
        }
        return new String(c);
    }
}
