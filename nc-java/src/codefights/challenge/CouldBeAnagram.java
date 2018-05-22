package codefights.challenge;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/hqLbYHvpTMZYYLA6h
 */
public class CouldBeAnagram {

    /**
     * for (; i < q;) {
     * t = s1.charAt(i);
     * x = s2.charAt(i++);
     * }
     * int ra = 0, rb = 0;
     * return ra - cb == 0 || rb + ca == 0;
     */

    int c[] = new int[255], n, q, t, x, i, g, u = 63;

    public Object couldBeAnagram(String b, String v) {
        g = i = (q = b.length()) != v.length() ? q : 0;
        while (i < q) {
            t = b.charAt(i);
            x = v.charAt(i++);
            if (t != u) c[t]++;
            if (x != u) c[x]--;
            if (t == u | x == u) n++;
        }
        for (int z : c) g += z > 0 ? z : -z;
        return g == n;
    }

}
