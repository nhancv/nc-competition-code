package codefights.interview.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://codefights.com/interview-practice/task/7u7oKqXoFdmh3vGyb
 * In chess, queens can move any number of squares vertically, horizontally, or diagonally. The n-queens puzzle is the problem of placing n queens on an n × n chessboard so that no two queens can attack each other.
 * <p>
 * Given an integer n, print all possible distinct solutions to the n-queens puzzle. Each solution contains distinct board configurations of the placement of the n queens, where the solutions are arrays that contain permutations of [1, 2, 3, .. n]. The number in the ith position of the results array indicates that the ith column queen is placed in the row with that number. In your solution, the board configurations should be returned in lexicographical order.
 * <p>
 * Example
 * <p>
 * For n = 1, the output should be
 * nQueens(n) = [[1]].
 * <p>
 * For n = 4, the output should be
 * <p>
 * nQueens(n) = [[2, 4, 1, 3],
 * [3, 1, 4, 2]]
 * This diagram of the second permutation, [3, 1, 4, 2], will help you visualize its configuration:
 * <p>
 * <p>
 * <p>
 * The element in the 1st position of the array, 3, indicates that the queen for column 1 is placed in row 3. Since the element in the 2nd position of the array is 1, the queen for column 2 is placed in row 1. The element in the 3rd position of the array is 4, meaning that the queen for column 3 is placed in row 4, and the element in the 4th position of the array is 2, meaning that the queen for column 4 is placed in row 2.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] integer n
 * <p>
 * The size of the board.
 * <p>
 * Guaranteed constraints:
 * <p>
 * 1 ≤ n ≤ 10.
 * <p>
 * [output] array.array.integer
 * <p>
 * All possible distinct board configurations of the placement of the n queens, ordered lexicographically.
 */
public class NQueens {

    List<int[]> res = new ArrayList<>();

    boolean check(int[][] mark, int i, int j) {
        for (int k = 0; k < mark.length; k++) {
            if (k != j && mark[i][k] == 1) return false;
            if (k != i && mark[k][j] == 1) return false;
        }

        int t = j - 1;
        for (int k = i - 1; k >= 0 && t >= 0; k--, t--) {
            if (mark[k][t] == 1) return false;
        }

        t = j + 1;
        for (int k = i + 1; k < mark.length && t < mark.length; k++, t++) {
            if (mark[k][t] == 1) return false;
        }


        t = j + 1;
        for (int k = i - 1; k > 0 && t < mark.length; k--, t++) {
            if (mark[k][t] == 1) return false;
        }

        t = j - 1;
        for (int k = i + 1; k < mark.length && t >= 0; k++, t--) {
            if (mark[k][t] == 1) return false;
        }

        return true;
    }

    void ans(int[][] mark) {
        int t = 0;
        int result[] = new int[mark.length];
        for (int c = 0; c < mark.length; c++, t++) {
            for (int r = 0; r < mark.length; r++) {
                if (mark[r][c] == 1) {
                    result[t] = r + 1;
                }
            }
        }
        res.add(result);
    }

    void traverse(int[][] mark, int j) {
        for (int k = 0; k < mark.length; k++) {
            if (j == mark.length) {
                ans(mark);
                return;
            } else if (check(mark, k, j)) {
                mark[k][j] = 1;
                traverse(mark, j + 1);
                mark[k][j] = 0;
            }
        }
    }

    public List<int[]> nQueens(int n) {
        res.clear();
        int[][] mark = new int[n][n];

        traverse(mark, 0);
//        for (int[] re : res) {
//            System.out.println(Arrays.toString(re));
//        }

        return res;
    }


}
