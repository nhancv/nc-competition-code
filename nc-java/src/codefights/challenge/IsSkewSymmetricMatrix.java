package codefights.challenge;

/**
 * https://app.codesignal.com/challenge/qoF5KkByT3gDg4gjq
 * A square matrix that is the negative of its transpose is a skew-symmetric matrix. Find out if the given matrix is skew-symmetric.
 * <p>
 * Example
 * <p>
 * For
 * <p>
 * matrix = [[ 0, 0,  1],
 * [ 0, 0, -2],
 * [-1, 2,  0]]
 * the output should be
 * isSkewSymmetricMatrix(matrix) = true;
 * <p>
 * For
 * <p>
 * matrix = [[ 0,  0,  1],
 * [ 0,  0, -2],
 * [-1, -2,  0]]
 * the output should be
 * isSkewSymmetricMatrix(matrix) = false.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.array.integer matrix
 * <p>
 * 2-dimensional array of integers representing a square matrix.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ matrix.length ≤ 5,
 * matrix[i].length = matrix.length,
 * -10 ≤ matrix[i][j] ≤ 10.
 * <p>
 * [output] boolean
 * <p>
 * true if matrix is a skew-symmetric matrix, false otherwise.
 */
public class IsSkewSymmetricMatrix {

    int i, j, l, r;

    public int isSkewSymmetricMatrix(int[][] m) {
        for (l = m.length; i < l; i++)
            for (j = 0; j < l; j++) r = m[i][j] != -m[j][i] ? 1 : r;
        return 1-r;
    }

}
