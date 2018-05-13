package codefights.interview.linkedlist;

/**
 * https://codefights.com/interview-practice/task/gX7NXPBrYThXZuanm
 * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the list, since this is what you'll be asked to do during an interview.
 * <p>
 * Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
 * <p>
 * Example
 * <p>
 * For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be
 * removeKFromList(l, k) = [1, 2, 4, 5];
 * For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
 * removeKFromList(l, k) = [1, 2, 3, 4, 5, 6, 7].
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
 * [input] integer k
 * <p>
 * An integer.
 * <p>
 * Guaranteed constraints:
 * -1000 ≤ k ≤ 1000.
 * <p>
 * [output] linkedlist.integer
 * <p>
 * Return l with all the values equal to k removed.
 */

public class RemoveKFromList {
    ListNode removeKFromList(ListNode<Integer> l, int k) {
        ListNode list = new ListNode<>(0);
        ListNode temp = list;
        while (l != null) {
            if (l.value != k) {
                temp.next = l;
                temp = temp.next;
            }
            l = l.next;
        }
        temp.next = null;
        return list.next;
    }
}
