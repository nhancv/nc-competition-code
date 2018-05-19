package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-4/xvkRbxYkdHdHNCKjg/description
 * You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
 * <p>
 * Example
 * <p>
 * For inputArray = [1, 1, 1], the output should be
 * arrayChange(inputArray) = 3.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer inputArray
 * <p>
 * Guaranteed constraints:
 * 3 ≤ inputArray.length ≤ 105,
 * -105 ≤ inputArray[i] ≤ 105.
 * <p>
 * [output] integer
 * <p>
 * The minimal number of moves needed to obtain a strictly increasing sequence from inputArray.
 * It's guaranteed that for the given test cases the answer always fits signed 32-bit integer type.
 */
public class ArrayChange {

    int arrayChange(int[] inputArray) {
        int res = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int a = inputArray[i];
            int b = inputArray[i + 1];

            if (a >= b) {
                int steps = a - b + 1;
                inputArray[i + 1] += steps;
                res += steps;
            }
        }
        return res;
    }

}
