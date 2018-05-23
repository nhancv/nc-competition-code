package codefights.challenge;


import com.sun.tools.javac.util.List;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/vvaEwn4NbpLYGMt5G
 * We'd like to construct a diverse array of numbers. At each step, we'll be given two choices for the next number we can add, and we'd like to select the number that appears least frequently in our array so far. If both numbers appear with equal frequency, we'll choose the smaller one.
 * <p>
 * Our choices will be given in the form of an array, choices, consisting of 2-element arrays of integers.
 */
public class LeastAppearance {

    int[] leastAppearance(int[][] c) {
        int [] r = new int[c.length], f = new int[105];
        for (int[] e : c) f[r[f[0]++] = f[e[1]] < f[e[0]] ? e[1] : e[0]]++;
        return r;
    }

}
