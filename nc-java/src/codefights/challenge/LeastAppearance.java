package codefights.challenge;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 * https://codefights.com/challenge/vvaEwn4NbpLYGMt5G
 * We'd like to construct a diverse array of numbers. At each step, we'll be given two choices for the next number we can add, and we'd like to select the number that appears least frequently in our array so far. If both numbers appear with equal frequency, we'll choose the smaller one.
 * <p>
 * Our choices will be given in the form of an array, choices, consisting of 2-element arrays of integers.
 */
public class LeastAppearance {


    List leastAppearance(int[][] c) {
        int [] r = new int[c.length], f = new int[105];
        for (int[] e : c) f[r[f[0]++] = f[e[1]] < f[e[0]] ? e[1] : e[0]]++;
        return Arrays.asList(r);
    }

//    List leastAppearance(int[][] c) {
//        List r = new ArrayList();
//        int f[] = new int[105], x;
//        for (int[] e : c) {
//            f[x = f[e[1]] < f[e[0]] ? e[1] : e[0]]++;
//            r.add(x);
//        }
//        return r;
//    }

}
