package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-2/xskq4ZxLyqQMCLshr
 */
public class MatrixElementsSum {
    int matrixElementsSum(int[][] matrix) {
        int coll = matrix[0].length;
        int sum = 0;
        for (int c = 0; c < coll; c++) {
            boolean x = false;
            for (int r = 0; r < matrix.length; r++) {
                if (!x) {
                    int v = matrix[r][c];
                    if (v == 0) x = true;
                    else {
                        sum += v;
                    }
                }
            }
        }
        return sum;
    }

}
