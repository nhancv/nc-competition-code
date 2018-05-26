package codefights.challenge;

import java.math.BigInteger;

/**
 * https://codefights.com/challenge/X2mPWE5pr4okydBF4
 */
public class BoredFriends {
    int boredFriends(String n) {
        return new BigInteger(n).mod(new BigInteger("" + 9)).intValue();
    }
}
