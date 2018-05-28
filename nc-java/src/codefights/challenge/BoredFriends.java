package codefights.challenge;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * https://codefights.com/challenge/X2mPWE5pr4okydBF4
 */
public class BoredFriends {
    int boredFriends(String n) {
        return n.chars().map(v -> v - 3).sum() % 9;
    }
}
