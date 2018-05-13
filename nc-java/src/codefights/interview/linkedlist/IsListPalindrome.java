package codefights.interview.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://codefights.com/interview-practice/task/HmNvEkfFShPhREMn4
 * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in l, since this is what you'll be asked to do during an interview.
 * <p>
 * Given a singly linked list of integers, determine whether or not it's a palindrome.
 * <p>
 * Example
 * <p>
 * For l = [0, 1, 0], the output should be
 * isListPalindrome(l) = true;
 * For l = [1, 2, 2, 3], the output should be
 * isListPalindrome(l) = false.
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] linkedlist.integer l
 * <p>
 * A singly linked list of integers.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ list size ≤ 5 · 105,
 * -109 ≤ element value ≤ 109.
 * <p>
 * [output] boolean
 * <p>
 * Return true if l is a palindrome, otherwise return false.
 */

public class IsListPalindrome {
    boolean isListPalindrome(ListNode<Integer> l) {
        List<Integer> originList = new ArrayList<>();
        while (l != null) {
            originList.add(l.value);
            l = l.next;
        }
        int size = originList.size();
        for (int i = 0; i < size / 2; i++) {
            if (!originList.get(i).equals(originList.get(size - 1 - i))){
                return false;
            }
        }
        return true;
    }

}
