package codefights.challenge;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/NsaawgDYBXz9CpwZu
 * Input:
 * n: 4
 * Expected Output:
 * ["   -   ",
 * "  -|-  ",
 * " -|-|- ",
 * "-|-|-|-",
 * " -|-|- ",
 * "  -|-  ",
 * "   -   "]
 */
public class Dashes {

    int i, j, m, c[];

    public String[] dashes(int n) {
        String r[] = new String[n = n * 2 - 1];
        c = new int[n];
        for (m = n / 2; i <= m; r[i] = r[n - i++ - 1] = new String(c, 0, n))
            for (j = 0; j <= m; j++)
                c[m - j] = c[m + j] = j < 1 ? (i % 2 > 0 ? 124 : 45) : c[m + j - 1] > 123 ? 45 : j > i ? 32 : 124;

        return r;
    }
}
