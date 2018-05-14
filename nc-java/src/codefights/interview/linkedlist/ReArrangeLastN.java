package codefights.interview.linkedlist;

/**
 * https://codefights.com/interview-practice/task/5vcioHMkhGqkaQQYt
 * Note: Try to solve this task in O(list size) time using O(1) additional space, since this is what you'll be asked during an interview.
 * <p>
 * Given a singly linked list of integers l and a non-negative integer n, move the last n list nodes to the beginning of the linked list.
 * <p>
 * Example
 * <p>
 * For l = [1, 2, 3, 4, 5] and n = 3, the output should be
 * rearrangeLastN(l, n) = [3, 4, 5, 1, 2];
 * For l = [1, 2, 3, 4, 5, 6, 7] and n = 1, the output should be
 * rearrangeLastN(l, n) = [7, 1, 2, 3, 4, 5, 6].
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] linkedlist.integer l
 * <p>
 * A singly linked list of integers.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ list size ≤ 105,
 * -1000 ≤ element value ≤ 1000.
 * <p>
 * [input] integer n
 * <p>
 * A non-negative integer.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ n ≤ list size.
 * <p>
 * [output] linkedlist.integer
 * <p>
 * Return l with the n last elements moved to the beginning.
 */
public class ReArrangeLastN {

    ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        if (l == null || n == 0) return l;
        ListNode<Integer> temp = l;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        temp.next = l;
        n = n % len;
        for (int i = 0; i < (len - n); i++) {
            temp = temp.next;
        }
        l = temp.next;
        temp.next = null;
        return l;
    }
}
