package codefights.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import javax.swing.KeyStroke;

/**
 * https://codefights.com/challenge/kPqbi8hC8d47Tpm8d
 * https://help.adobe.com/en_US/AS2LCR/Flash_10.0/help.html?content=00000520.html
 * Hey! We've all used a text editor before (you're probably about to use one right now!) but have you ever wondered how they work behind the scenes? In this series of challenges we'll be looking at some of the interesting programmatic ideas involved in text editors.
 * <p>
 * Let's start with something relatively simple: we'll just display some text the user typed. More formally, given a series of keystrokes (in the form of an array of key codes), we'd like to return the resulting string.
 * <p>
 * Example
 * <p>
 * For keycodes = [78, 73, 67, 69, 32, 65, 78, 68, 32, 83, 73, 77, 80, 76, 69], the output should be textDisplay(keycodes) = "nice and simple".
 * <p>
 * For keycodes = [72, 69, 89, 32, 89, 79, 85, 32, 68, 73, 68, 32, 73, 84, 32, 87, 82, 79, 78, 71, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 188, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 46, 46, 8, 8, 46, 46, 8], the output should be textDisplay(keycodes) = "hey, you did it".
 * <p>
 * NOTE: For the sake of simplicity, we won't be using the shift key, but you can expect the tests to include backspace, delete, home, end, and the left & right arrow keys, in addition to alphanumeric characters and punctuation.
 * <p>
 * You can use this reference page or this cool app to look up key codes.
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer keycodes
 * <p>
 * An array representing the codes of each key the user typed (in order).
 * <p>
 * Guaranteed constraints:
 * 0 ≤ keycodes.length ≤ 104,
 * keycodes[i] ∈ [8, 32, 35, 36, 37, 39, 46, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 186, 188, 190, 222].
 * <p>
 * [output] string
 * <p>
 * The final result of what the user typed after all the key codes are processed.
 */
public class TextDisplay {

    public String textDisplay(int[] I) {
        List<Character> r = new Vector<>();
        int c = 0, l, t;
        String s = "";
        for (int k : I) {
            l = r.size();
            c = k == 35 ? l : k == 36 ? 0 : c;
            t = c > 0 ? k == 8 ? r.remove(--c) : k == 37 ? c-- : 0 : 0;
            t = c < l ? k == 46 ? r.remove(c) : k == 39 ? c++ : 0 : 0;
            if (k == 32 || k > 47)
                r.add(c++, (char)(k == 186 ? 59 : k == 222 ? 39 : k > 187 ? k - 144 : k));
        }

        for (Object x : r) s += x;
        return s.toLowerCase();
    }

}
