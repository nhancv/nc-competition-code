package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-3/3AdBC97QNuhF6RwsQ
 * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
 * <p>
 * Given a ticket number n, determine if it's lucky or not.
 * <p>
 * Example
 * <p>
 * For n = 1230, the output should be
 * isLucky(n) = true;
 * For n = 239017, the output should be
 * isLucky(n) = false.
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] integer n
 * <p>
 * A ticket number represented as a positive integer with an even number of digits.
 * <p>
 * Guaranteed constraints:
 * 10 ≤ n < 106.
 * <p>
 * [output] boolean
 * <p>
 * true if n is a lucky ticket number, false otherwise.
 */
public class IsLucky {
    public boolean isLucky(int n) {
        int numl = (int) Math.log10(n) + 1;
        if (numl % 2 != 0) return false;
        int sumb = 0;
        int i = 0;
        while (i < numl / 2) {
            sumb += n % 10;
            n = n / 10;
            i++;
        }

        int suma = 0;
        i = 0;
        while (i < numl / 2) {
            suma += n % 10;
            n = n / 10;
            i++;
        }
        return sumb == suma;
    }
}
