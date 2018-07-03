package codefights.challenge;

import java.util.Arrays;

/**
 * https://codefights.com/challenge/4PLW8uTndBKB7FghP
 */
public class HardSurname {

    int m, n;
    int hardSurname(String s) {
        s.chars().forEach(v -> {
            if ("ueoaiUEOAI".indexOf(v) < 0) m = m < ++n ? n : m;
            else n=0;
        });
        return m;
    }

}
