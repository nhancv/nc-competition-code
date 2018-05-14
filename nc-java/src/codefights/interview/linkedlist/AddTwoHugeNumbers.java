package codefights.interview.linkedlist;

/**
 * https://codefights.com/interview-practice/task/RvDFbsNC3Xn7pnQfH
 * You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999 that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to add up these huge integers and return the result in the same format.
 * <p>
 * Example
 * <p>
 * For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
 * addTwoHugeNumbers(a, b) = [9876, 5434, 0].
 * <p>
 * Explanation: 987654321999 + 18001 = 987654340000.
 * <p>
 * For a = [123, 4, 5] and b = [100, 100, 100], the output should be
 * addTwoHugeNumbers(a, b) = [223, 104, 105].
 * <p>
 * Explanation: 12300040005 + 10001000100 = 22301040105.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] linkedlist.integer a
 * <p>
 * The first number, without its leading zeros.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ a size ≤ 104,
 * 0 ≤ element value ≤ 9999.
 * <p>
 * [input] linkedlist.integer b
 * <p>
 * The second number, without its leading zeros.
 * <p>
 * Guaranteed constraints:
 * 0 ≤ b size ≤ 104,
 * 0 ≤ element value ≤ 9999.
 * <p>
 * [output] linkedlist.integer
 * <p>
 * The result of adding a and b together, returned without leading zeros in the same format.
 */
public class AddTwoHugeNumbers {
    ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> head = result;
        int carry = 0;
        a = reverse(a);
        b = reverse(b);
        while (a != null || b != null) {
            if (a != null) {
                carry += a.value;
                a = a.next;
            }
            if (b != null) {
                carry += b.value;
                b = b.next;
            }
            head.next = new ListNode<>(carry % 10000);
            head = head.next;
            carry = carry / 10000;
        }
        if (carry >= 1)
            head.next = new ListNode<>(carry);

        return reverse(result.next);
    }

    ListNode<Integer> reverse(ListNode<Integer> head) {
        ListNode<Integer> prev = null;
        while (head != null) {
            ListNode<Integer> temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
