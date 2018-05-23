
import java.util.Arrays;
import java.util.List;

import codefights.challenge.CouldBeAnagram;

public class Main {

    public static void main(String[] args) {
        int[][] c = new int[][]{
                {1, 2},
                {3, 4},
                {1, 2}
        };
        int[] r = new int[1 << 19], f = new int[105];
        for (int[] e : c) f[r[f[0]++] = f[e[1]] < f[e[0]] ? e[1] : e[0]]++;
        System.out.println(Arrays.toString(Arrays.copyOf(r, f[0])));
    }

}
