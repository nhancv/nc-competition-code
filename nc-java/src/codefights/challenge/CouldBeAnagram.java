package codefights.challenge;

/**
 * https://codefights.com/challenge/hqLbYHvpTMZYYLA6h
 */
public class CouldBeAnagram {

    int c[] = new int[125], g;
    public Object couldBeAnagram(String b, String v) {
        for (char x : b.toCharArray()) c[x]++;
        for (char x : v.toCharArray()) c[x]--;
        for (int z : c) g += z < 0 ? -z : z;
        return g == c[63] * 2;
    }

}
