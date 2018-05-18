package codefights.challenge;

/**
 * https://codefights.com/challenge/uYSoY28HtFcfuhdYS
 * Given a matrix of integers, your task is to find the biggest plus (+) shape formed by adjacent equal numbers.
 * <p>
 * More formally, the size of the plus is based on the distance from its centre to its shortest arm. For example, the plus formed by the 2's below would have a size of 1, even though one of its arms extends further.
 * <p>
 * [[1,0,2,3],
 * [2,2,2,2],
 * [4,3,2,5]]
 * Specifically, we would like to find the coordinates of the center of the biggest plus (row index and column index). If there is more than one biggest plus, return the coordinates with the smallest row index; if there is more than one biggest plus with the same row indices, return the coordinates with the smallest column index.
 * <p>
 * Example
 * <p>
 * For
 * arr = [[6,8,0,5,9,6,7,8,9,7],
 * [6,6,0,1,9,6,7,8,2,7],
 * [7,7,7,7,7,7,7,7,7,7],
 * [6,7,0,1,7,6,7,6,7,7],
 * [6,6,0,1,6,6,7,6,9,7],
 * [6,6,0,1,6,6,7,6,6,7],
 * [1,1,1,1,1,1,7,1,1,7],
 * [8,8,0,1,6,6,7,6,6,7],
 * [1,1,1,1,1,1,7,6,5,7]]
 * the output should be biggestPlus(arr) = [2, 6]
 * <p>
 * although there's another plus of size 2 centered at [6, 3], the one at [2, 6] has a smaller row index
 * <p>
 * Input / Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.array.integer arr
 * <p>
 * A rectangular matrix of whole numbers
 * <p>
 * Guaranteed constraints:
 * 1 ≤ arr.length ≤ 500,
 * 1 ≤ arr[i].length ≤ 500,
 * 0 ≤ arr[i][j] ≤ 10.
 * <p>
 * [output] array.integer
 * <p>
 * A 2-element array consisting of the row index and column index of the center of the biggest plus made up of equal numbers
 */
public class Biggestplus {

    int l[], m, i, j, z, o, p, t, x, y;

    public int[] biggestplus(int[][] a) {
        for (o = a.length; i < o; i++)
            for (l = a[i], p = l.length, j = 1; j < p; j++)
                for (t = l[j], z = 0; j >= z & j + z < p & i >= z & i + z < o &&
                        (t ^ l[j - z] | t ^ l[j + z] | t ^ a[i - z][j] | t ^ a[i + z][j]) < 1; z++)
                    if (z > m) {
                        m = z;
                        x = i;
                        y = j;
                    }
        return new int[]{x, y};
    }

}
