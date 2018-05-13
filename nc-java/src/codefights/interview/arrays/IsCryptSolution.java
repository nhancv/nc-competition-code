package codefights.interview.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://codefights.com/interview-practice/task/yM4uWYeQTHzYewW9H
 * A cryptarithm is a mathematical puzzle for which the goal is to find the correspondence between letters and digits, such that the given arithmetic equation consisting of letters holds true when the letters are converted to digits.
 * <p>
 * You have an array of strings crypt, the cryptarithm, and an an array containing the mapping of letters and digits, solution. The array crypt will contain three non-empty strings that follow the structure: [word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.
 * <p>
 * If crypt, when it is decoded by replacing all of the letters in the cryptarithm with digits using the mapping in solution, becomes a valid arithmetic equation containing no numbers with leading zeroes, the answer is true. If it does not become a valid arithmetic solution, the answer is false.
 * <p>
 * Example
 * <p>
 * For crypt = ["SEND", "MORE", "MONEY"] and
 * <p>
 * solution = [['O', '0'],
 * ['M', '1'],
 * ['Y', '2'],
 * ['E', '5'],
 * ['N', '6'],
 * ['D', '7'],
 * ['R', '8'],
 * ['S', '9']]
 * the output should be
 * isCryptSolution(crypt, solution) = true.
 * <p>
 * When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt, you get 9567 + 1085 = 10652 which is correct and a valid arithmetic equation.
 * <p>
 * For crypt = ["TEN", "TWO", "ONE"] and
 * <p>
 * solution = [['O', '1'],
 * ['T', '0'],
 * ['W', '9'],
 * ['E', '5'],
 * ['N', '4']]
 * the output should be
 * isCryptSolution(crypt, solution) = false.
 * <p>
 * Even though 054 + 091 = 145, 054 and 091 both contain leading zeroes, meaning that this is not a valid solution.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.string crypt
 * <p>
 * An array of three non-empty strings containing only uppercase English letters.
 * <p>
 * Guaranteed constraints:
 * crypt.length = 3,
 * 1 ≤ crypt[i].length ≤ 14.
 * <p>
 * [input] array.array.char solution
 * <p>
 * An array consisting of pairs of characters that represent the correspondence between letters and numbers in the cryptarithm. The first character in the pair is an uppercase English letter, and the second one is a digit in the range from 0 to 9.
 * <p>
 * Guaranteed constraints:
 * solution[i].length = 2,
 * 'A' ≤ solution[i][0] ≤ 'Z',
 * '0' ≤ solution[i][1] ≤ '9',
 * solution[i][0] ≠ solution[j][0], i ≠ j,
 * solution[i][1] ≠ solution[j][1], i ≠ j.
 * <p>
 * It is guaranteed that solution only contains entries for the letters present in crypt and that different letters have different values.
 * <p>
 * [output] boolean
 * <p>
 * Return true if the solution represents the correct solution to the cryptarithm crypt, otherwise return false.
 */
public class IsCryptSolution {
    boolean isCryptSolution(String[] crypt, char[][] solution) {
        char[] dict = new char[200];
        for (char[] aSolution : solution) {
            dict[aSolution[0]] = aSolution[1];
        }

        List<Double> list = new ArrayList<>();
        for (String str : crypt) {
            if (dict[str.charAt(0)] == '0' && str.length() > 1) return false;
            StringBuilder num = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                num.append(dict[str.charAt(i)]);
            }
            System.out.println(num);
            list.add(Double.parseDouble(num.toString()));
        }
        return list.get(0) + list.get(1) == list.get(2);
    }
}
