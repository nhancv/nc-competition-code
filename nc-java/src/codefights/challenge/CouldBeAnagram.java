package codefights.challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * https://codefights.com/challenge/hqLbYHvpTMZYYLA6h
 */
public class CouldBeAnagram {

    int c[] = new int[125], i;

    Object couldBeAnagram(String b, String v) {
        for (int x : (v + b).getBytes())
            i = (c[x] += i++ < v.length() ? 1 : -1) < 0 & x > 63 ? 0 : i;
        return 2 * b.length() == i;
    }


}
