package codefights.arcade.intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javafx.util.Pair;

/**
 * https://codefights.com/arcade/intro/level-3/3o6QFqgYSontKsyk4
 * You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in s form a regular bracket sequence.
 * <p>
 * Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
 * <p>
 * Example
 * <p>
 * For string s = "a(bc)de", the output should be
 * reverseParentheses(s) = "acbde".
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] string s
 * <p>
 * A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a regular bracket sequence.
 * <p>
 * Constraints:
 * 5 ≤ s.length ≤ 55.
 * <p>
 * [output] string
 */
public class ReverseParentheses {
    public String reverseParentheses(String s) {
        Stack<Integer> leftBrackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftBrackets.push(i);
            } else if(c == ')') {
                int l = leftBrackets.pop();
                String old = s.substring(l+1, i);
                String reverse = new StringBuilder(old).reverse().toString();
                s = s.substring(0, l) + reverse + s.substring(i+1, s.length());
                i-=2;
            }
        }
        return s;
    }
}
