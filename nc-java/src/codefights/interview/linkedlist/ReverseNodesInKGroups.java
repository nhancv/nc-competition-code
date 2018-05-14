package codefights.interview.linkedlist;

/**
 * https://codefights.com/interview-practice/task/XP2Wn9pwZW6hvqH67
 * Note: Your solution should have O(n) time complexity, where n is the number of element in l, and O(1) additional space complexity, since this is what you would be asked to accomplish in an interview.
 * <p>
 * Given a linked list l, reverse its nodes k at a time and return the modified list. k is a positive integer that is less than or equal to the length of l. If the number of nodes in the linked list is not a multiple of k, then the nodes that are left out at the end should remain as-is.
 * <p>
 * You may not alter the values in the nodes - only the nodes themselves can be changed.
 * <p>
 * Example
 * <p>
 * For l = [1, 2, 3, 4, 5] and k = 2, the output should be
 * reverseNodesInKGroups(l, k) = [2, 1, 4, 3, 5];
 * For l = [1, 2, 3, 4, 5] and k = 1, the output should be
 * reverseNodesInKGroups(l, k) = [1, 2, 3, 4, 5];
 * For l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] and k = 3, the output should be
 * reverseNodesInKGroups(l, k) = [3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11].
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] linkedlist.integer l
 * <p>
 * A singly linked list of integers.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ list size ≤ 104,
 * -109 ≤ element value ≤ 109.
 * <p>
 * [input] integer k
 * <p>
 * The size of the groups of nodes that need to be reversed.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ k ≤ l size.
 * <p>
 * [output] linkedlist.integer
 * <p>
 * The initial list, with reversed groups of k elements.
 */
public class ReverseNodesInKGroups {
    ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
        if (l == null || l.next == null || k == 1) return l;
        ListNode<Integer> list = new ListNode<>(0);
        list.next = l;
        ListNode<Integer> startNode = list;
        int i = 0;
        while (l != null) {
            i++;
            if (i % k == 0) {
                startNode = reverse(startNode, l.next);
                l = startNode.next;
            } else {
                l = l.next;
            }

        }
        return list.next;
    }

    //  0 ->[ 1 -> 2 ]-> 3 ==> 0 ->[ 2 -> 1 ]-> 3
    <T> ListNode<T> reverse(ListNode<T> startNode, ListNode<T> endNode) {
        ListNode<T> prev = endNode;
        ListNode<T> nextStartNode = startNode.next;
        ListNode<T> curr = startNode.next;
        while (curr != endNode) {
            ListNode<T> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        startNode.next = prev;
        return nextStartNode;

    }
}
