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
        for (c = new int[n], m = n / 2; i <= m; ) {
            for (j = 0; j < n; c[j++] = ' ', c[m] = i % 2 > 0 ? '|' : '-') ;
            for (j = 1; j <= i; c[m - j] = c[m + j] = c[m + j++ - 1] == '-' ? '|' : '-') ;
            r[i] = r[n - i++ - 1] = new String(c, 0, n);
        }
        return r;
    }
}
