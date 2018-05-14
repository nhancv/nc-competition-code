package codefights.interview.linkedlist;

/**
 * https://codefights.com/interview-practice/task/6rE3maCQwrZS3Mm2H
 * Note: Your solution should have O(l1.length + l2.length) time complexity, since this is what you will be asked to accomplish in an interview.
 * <p>
 * Given two singly linked lists sorted in non-decreasing order, your task is to merge them. In other words, return a singly linked list, also sorted in non-decreasing order, that contains the elements from both original lists.
 * <p>
 * Example
 * <p>
 * For l1 = [1, 2, 3] and l2 = [4, 5, 6], the output should be
 * mergeTwoLinkedLists(l1, l2) = [1, 2, 3, 4, 5, 6];
 * For l1 = [1, 1, 2, 4] and l2 = [0, 3, 5], the output should be
 * mergeTwoLinkedLists(l1, l2) = [0, 1, 1, 2, 3, 4, 5].
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] linkedlist.integer l1
 * <p>
 * A singly linked list of integers.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ list size ≤ 104,
 * -109 ≤ element value ≤ 109.
 * <p>
 * [input] linkedlist.integer l2
 * <p>
 * A singly linked list of integers.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ list size ≤ 104,
 * -109 ≤ element value ≤ 109.
 * <p>
 * [output] linkedlist.integer
 * <p>
 * A list that contains elements from both l1 and l2, sorted in non-decreasing order.
 */
public class MergeTwoLinkedLists {
    ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        ListNode<Integer> list = new ListNode<>(0);
        ListNode<Integer> head = list;
        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }

        if (l1 != null) {
            head.next = l1;
        }
        if (l2 != null) {
            head.next = l2;
        }

        return list.next;
    }
}
