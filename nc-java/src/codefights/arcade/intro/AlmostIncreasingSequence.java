package codefights.arcade.intro;

/**
 * https://codefights.com/arcade/intro/level-2/2mxbGwLzvkTCKAJMG/description
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.
 * <p>
 * Example
 * <p>
 * For sequence = [1, 3, 2, 1], the output should be
 * almostIncreasingSequence(sequence) = false;
 * <p>
 * There is no one element in this array that can be removed in order to get a strictly increasing sequence.
 * <p>
 * For sequence = [1, 3, 2], the output should be
 * almostIncreasingSequence(sequence) = true.
 * <p>
 * You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer sequence
 * <p>
 * Guaranteed constraints:
 * 2 ≤ sequence.length ≤ 105,
 * -105 ≤ sequence[i] ≤ 105.
 * <p>
 * [output] boolean
 * <p>
 * Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.
 */
public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {
        if (sequence.length == 2) return true;
        int peak = 0;
        int peakIndex = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i - 1] >= sequence[i]) {
                peakIndex = i;
                peak++;
            }
        }
        if (peak < 1) return true;
        else if (peak == 1) {
            boolean check = false;
            if (peakIndex - 2 >= 0 && sequence[peakIndex - 2] < sequence[peakIndex]) check = true;
            if (peakIndex - 2 < 0 && peakIndex + 1 < sequence.length && sequence[peakIndex] < sequence[peakIndex + 1])
                check = true;

            if (peakIndex + 1 < sequence.length && sequence[peakIndex - 1] < sequence[peakIndex + 1]) check = true;
            if (peakIndex + 1 >= sequence.length && peakIndex - 2 >= 0 && sequence[peakIndex - 2] < sequence[peakIndex - 1])
                check = true;

            return check;
        }

        return false;
    }

}
