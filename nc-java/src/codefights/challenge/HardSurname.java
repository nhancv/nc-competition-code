package codefights.challenge;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/4PLW8uTndBKB7FghP
 */
public class HardSurname {

    int m, n;

    public int hardSurname(String s) {
        s.chars().forEach(v -> n = "ueoaiUEOAI".indexOf(v) < 0 ? m < ++n ? m = n : n : 0);
        return m;
    }

}
