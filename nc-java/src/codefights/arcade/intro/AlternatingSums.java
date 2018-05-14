package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-4/cC5QuL9fqvZjXJsW9
 * Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
 * <p>
 * You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.
 * <p>
 * Example
 * <p>
 * For a = [50, 60, 60, 45, 70], the output should be
 * alternatingSums(a) = [180, 105].
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer a
 * <p>
 * Guaranteed constraints:
 * 1 ≤ a.length ≤ 10,
 * 45 ≤ a[i] ≤ 100.
 * <p>
 * [output] array.integer
 */
public class AlternatingSums {
    int[] alternatingSums(int[] a) {
        int[] res = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) res[0] += a[i];
            else res[1] += a[i];
        }
        return res;
    }

}
