package codefights.interview.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/**
 * https://codefights.com/interview-practice/task/Ki9zRh5bfRhH6oBau
 * You have two arrays of strings, words and parts. Return an array that contains the strings from words, modified so that any occurrences of the substrings from parts are surrounded by square brackets [], following these guidelines:
 * <p>
 * If several parts substrings occur in one string in words, choose the longest one. If there is still more than one such part, then choose the one that appears first in the string.
 * <p>
 * Example
 * <p>
 * For words = ["Apple", "Melon", "Orange", "Watermelon"] and parts = ["a", "mel", "lon", "el", "An"], the output should be
 * findSubstrings(words, parts) = ["Apple", "Me[lon]", "Or[a]nge", "Water[mel]on"].
 * <p>
 * While "Watermelon" contains three substrings from the parts array, "a", "mel", and "lon", "mel" is the longest substring that appears first in the string.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.string words
 * <p>
 * An array of strings consisting only of uppercase and lowercase English letters.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ words.length ≤ 104,
 * 1 ≤ words[i].length ≤ 30.
 * <p>
 * [input] array.string parts
 * <p>
 * An array of strings consisting only of uppercase and lower English letters. Each string is no more than 5 characters in length.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ parts.length ≤ 105,
 * 1 ≤ parts[i].length ≤ 5,
 * parts[i] ≠ parts[j].
 * <p>
 * [output] array.string
 */
public class FindSubstrings {

    public String[] findSubstrings(String[] words, String[] parts) {
        HashSet<String> partSet = new HashSet<>(Arrays.asList(parts));
        for (int i = 0; i < words.length; i++) {
            boolean end = false;
            for (int j = 5; j >= 1; j--) {
                for (int k = 0; k + j <= words[i].length(); k++) {
                    if (partSet.contains(words[i].substring(k, k + j))) {
                        words[i] = words[i].substring(0, k) + "[" + words[i].substring(k, k + j) + "]" + words[i].substring(k + j);
                        end = true;
                        break;
                    }
                }
                if(end) break;
            }
        }
        return words;
    }

}
