package codefights.challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * https://codefights.com/challenge/hqLbYHvpTMZYYLA6h
 */
public class CouldBeAnagram {

    int c[] = new int[125], g;
    Object couldBeAnagram(String b, String v) {
        for (int x : b.getBytes()) c[x]++;
        for (int x : v.getBytes()) c[x]--;
        for (int z : c) g += z < 0 ? -z : z;
        return g == c[63] * 2;
    }


}
