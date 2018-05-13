package codefights.interview.arrays;

/**
 * https://codefights.com/interview-practice/task/5A8jwLGcEpTPyyjTB
 * Note: Try to solve this task in-place (with O(1) additional memory), since this is what you'll be asked to do during an interview.
 * <p>
 * You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).
 * <p>
 * Example
 * <p>
 * For
 * <p>
 * a = [[1, 2, 3],
 * [4, 5, 6],
 * [7, 8, 9]]
 * the output should be
 * <p>
 * rotateImage(a) =
 * [[7, 4, 1],
 * [8, 5, 2],
 * [9, 6, 3]]
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.array.integer a
 * <p>
 * Guaranteed constraints:
 * 1 ≤ a.length ≤ 100,
 * a[i].length = a.length,
 * 1 ≤ a[i][j] ≤ 104.
 * <p>
 * [output] array.array.integer
 */
public class RotateImage {
    int[][] rotateImage(int[][] a) {
        int temp;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }

        return a;
    }
}
