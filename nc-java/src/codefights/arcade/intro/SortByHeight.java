package codefights.arcade.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://codefights.com/arcade/intro/level-3/D6qmdBL2NYz49XHwM
 * Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
 * <p>
 * Example
 * <p>
 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
 * sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer a
 * <p>
 * If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.
 * <p>
 * Guaranteed constraints:
 * 5 ≤ a.length ≤ 15,
 * -1 ≤ a[i] ≤ 200.
 * <p>
 * [output] array.integer
 * <p>
 * Sorted array a with all the trees untouched.
 */
public class SortByHeight {
    int[] sortByHeight(int[] a) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                arrayList.add(a[i]);
            }
        }
        Collections.sort(arrayList);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = arrayList.get(0);
                arrayList.remove(0);
            }
        }
        return a;
    }

}
