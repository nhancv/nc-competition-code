package codefights.challenge;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * https://codefights.com/challenge/hqLbYHvpTMZYYLA6h
 */
public class CouldBeAnagram {

    Object couldBeAnagram(String s, String t) {
        int a[] = new int[123], i = 2;
        for(;--i > -2; t = s)
            for (int c : t.getBytes()) a[c] += i;
        for (int c : a) i -= c < 0 ? 0 : c;
        return i+2 == a[63];
    }

//    int c[] = new int[125], i;
//
//    Object couldBeAnagram(String b, String v) {
//        for (int x : (v + b).getBytes())
//            i = (c[x] += i++ < v.length() ? 1 : -1) < 0 & x > 63 ? 0 : i;
//        return 2 * b.length() == i;
//    }


}
