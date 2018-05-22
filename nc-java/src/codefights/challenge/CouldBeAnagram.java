package codefights.challenge;


/**
 * https://codefights.com/challenge/hqLbYHvpTMZYYLA6h
 */
public class CouldBeAnagram {

    int c[] = new int[125], q, i, g;

    public Object couldBeAnagram(String b, String v) {
        g = i = (q = b.length()) != v.length() ? q : 0;
        for (; i < q; c[b.charAt(i)]++, c[v.charAt(i++)]--) ;
        for (int z : c) g += z >= 0 ? z : -z;
        return g == c[63] * 2;
    }

}
