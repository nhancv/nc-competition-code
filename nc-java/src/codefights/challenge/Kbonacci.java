package codefights.challenge;

import java.math.BigInteger;

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

    /**
     * k==1 | n < k => 1
     * n==k => k
     * f(i) = 2f(i-1) - f(i-k-1)
     * i = [1..n-k]
     */

    public String kbonacci(int k, int n) {
        BigInteger[] t = new BigInteger[n + k + 1];
        int i = -1;
        while (++i <= n)
            t[i] = i > k ? t[i - 1].add(t[i - 1]).subtract(t[i - k - 1]) : BigInteger.valueOf(i < k ? 1 : k);
        return t[n].toString();
    }

}
