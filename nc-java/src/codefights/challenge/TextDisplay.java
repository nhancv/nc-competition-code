package codefights.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * https://codefights.com/challenge/kPqbi8hC8d47Tpm8d
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
    public String textDisplay(int[] keycodes) {
        if (keycodes.length == 0) return "";
        List<Character> res = new ArrayList<>();
        int cursor = 0;
        for (int i = 0; i < keycodes.length; i++) {
            int code = keycodes[i];
            switch (code) {
                case 8: //backspace
                    if (cursor > 0 && cursor <= res.size()) {
                        res.remove(--cursor);
                    }
                    break;
                case 46: //delete
                    if(cursor>=0 && cursor < res.size()){
                        res.remove(cursor);
                    }
                    break;
                case 35: //end
                    cursor = res.size();
                    break;
                case 36: //home
                    cursor = 0;
                    break;
                case 37: //left arrow
                    if (cursor > 0) cursor--;
                    break;
                case 39: //right arrow
                    if (cursor < res.size()) cursor++;
                    break;
                case 186: //semi-colon
                    res.add(cursor++, ';');
                    break;
                case 188: //comma
                    res.add(cursor++, ',');
                    break;
                case 190: //period
                    res.add(cursor++, '.');
                    break;
                case 222: //single quote
                    res.add(cursor++, '\'');
                    break;
                default:
                    res.add(cursor++, Character.toLowerCase((char) code));
                    break;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < res.size(); i++) {
            s.append(res.get(i));
        }
        return s.toString();
    }

}
