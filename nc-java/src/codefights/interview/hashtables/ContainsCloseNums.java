package codefights.interview.hashtables;

import java.util.HashMap;
import java.util.Map;

/**
 * https://codefights.com/interview-practice/task/njfXsvjRthFKmMwLC
 * Given an array of integers nums and an integer k, determine whether there are two distinct indices i and j in the array where nums[i] = nums[j] and the absolute difference between i and j is less than or equal to k.
 * <p>
 * Example
 * <p>
 * For nums = [0, 1, 2, 3, 5, 2] and k = 3, the output should be
 * containsCloseNums(nums, k) = true.
 * <p>
 * There are two 2s in nums, and the absolute difference between their positions is exactly 3.
 * <p>
 * For nums = [0, 1, 2, 3, 5, 2] and k = 2, the output should be
 * <p>
 * containsCloseNums(nums, k) = false.
 * <p>
 * The absolute difference between the positions of the two 2s is 3, which is more than k.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer nums
 * <p>
 * Guaranteed constraints:
 * 0 ≤ nums.length ≤ 55000,
 * -231 - 1 ≤ nums[i] ≤ 231 - 1.
 * <p>
 * [input] integer k
 * <p>
 * Guaranteed constraints:
 * 0 ≤ k ≤ 35000.
 * <p>
 * [output] boolean
 */
public class ContainsCloseNums {

    boolean containsCloseNums(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }


}
