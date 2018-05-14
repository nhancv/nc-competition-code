package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-4/ZCD7NQnED724bJtjN
 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
 * <p>
 * Example
 * <p>
 * For
 * <p>
 * picture = ["abc",
 * "ded"]
 * the output should be
 * <p>
 * addBorder(picture) = ["*****",
 * "*abc*",
 * "*ded*",
 * "*****"]
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.string picture
 * <p>
 * A non-empty array of non-empty equal-length strings.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ picture.length ≤ 100,
 * 1 ≤ picture[i].length ≤ 100.
 * <p>
 * [output] array.string
 * <p>
 * The same matrix of characters, framed with a border of asterisks of width 1.
 */
public class AddBorder {
    public String[] addBorder(String[] picture) {
        String[] res = new String[picture.length + 2];
        int colLength = picture[0].length() + 2;
        StringBuilder topBot = new StringBuilder();
        for (int i = 0; i < colLength; i++) {
            topBot.append("*");
        }
        res[0] = topBot.toString();
        res[picture.length + 1] = topBot.toString();
        for (int i = 1; i < picture.length + 1; i++) {
            res[i] = "*" + picture[i-1] + "*";
        }
        return res;
    }
}
