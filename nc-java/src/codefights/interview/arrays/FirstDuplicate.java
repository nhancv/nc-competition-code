package codefights.interview.arrays;

/**
 * https://codefights.com/interview-practice/task/pMvymcahZ8dY4g75q
 * <p>
 * Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, return the number for which the second occurrence has a smaller index than the second occurrence of the other number does. If there are no such elements, return -1.
 * <p>
 * Example
 * <p>
 * For a = [2, 1, 3, 5, 3, 2], the output should be
 * firstDuplicate(a) = 3.
 * <p>
 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.
 * <p>
 * For a = [2, 4, 3, 5, 1], the output should be
 * firstDuplicate(a) = -1.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer a
 * <p>
 * Guaranteed constraints:
 * 1 ≤ a.length ≤ 105,
 * 1 ≤ a[i] ≤ a.length.
 * <p>
 * [output] integer
 * <p>
 * The element in a that occurs in the array more than once and has the minimal index for its second occurrence. If there are no such elements, return -1.
 */

public class FirstDuplicate {
    int firstDuplicate(int[] a) {
        if (a.length <= 1) return -1;
        for (int i = 0; i < a.length; i++) {
            int pos = Math.abs(a[i]) - 1;
            if (a[pos] < 0) return pos + 1;
            else a[pos] = -a[pos];
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstDuplicate firstDuplicate = new FirstDuplicate();
        System.out.println(firstDuplicate.firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
    }


}