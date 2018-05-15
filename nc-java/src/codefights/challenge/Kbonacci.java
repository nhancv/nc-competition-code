package codefights.challenge;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://codefights.com/challenge/sbbmjCsPhn77Qkqtm/solutions
 * Define the k-bonacci sequence as follows. The first k terms are all 1. The nth term, for n >= k, is the sum of k previous terms in the sequence. For example, the first five terms of the 3-bonacci sequence are 1, 1, 1, 3, 5.
 * <p>
 * Given n and k, write a function which returns the nth term (0-indexed) of the k-bonacci sequence. Since the answer may be quite large, return it as a string.
 * <p>
 * Example
 * For k = 3 and n = 4, the output should be kbonacci(k, n) = "5".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] integer k
 * <p>
 * The value k defining the k-bonacci sequence; i.e., the degree of the recurrence.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ k ≤ 103.
 * <p>
 * [input] integer n
 * <p>
 * The term of the k-bonacci sequence to return.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ n ≤ 25000.
 * <p>
 * [output] string
 * <p>
 * The nth number of the k-bonacci sequence, returned as a string.
 */
public class Kbonacci {

    BigInteger[] b;

    BigInteger f(int k, int n) {
        if (k == 1 | n < k) return b[n] = BigInteger.ONE;
        if (n == k) return b[n] = BigInteger.valueOf(k);
        return b[n] == null ? b[n] = BigInteger.valueOf(2).multiply(b[n - 1] == null ? b[n - 1] = f(k, n - 1) : b[n - 1]).subtract(b[n - k - 1] == null ? b[n - k - 1] = f(k, n - k - 1) : b[n - k - 1]) : b[n];
    }

    public String kbonacci(int k, int n) {
        b = new BigInteger[n + 1];
        if (n > k) {
            int x = n - k;
            BigInteger total = BigInteger.valueOf(2).pow(x - 1).multiply(BigInteger.valueOf(2 * k - 1));
            if (x > 1) {
                for (int i = x - 1; i > 0; i--) {
                    total = total.subtract(BigInteger.valueOf(2).pow(i - 1).multiply(b[x - i] == null ? b[x - i] = f(k, x - i) : b[x - i]));
                }
            }
            return total.toString();
        } else return f(k, n).toString();

    }

}
