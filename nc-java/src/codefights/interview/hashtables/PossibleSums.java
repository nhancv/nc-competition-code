package codefights.interview.hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://codefights.com/interview-practice/task/rMe9ypPJkXgk3MHhZ
 * You have a collection of coins, and you know the values of the coins and the quantity of each type of coin in it. You want to know how many distinct sums you can make from non-empty groupings of these coins.
 * <p>
 * Example
 * <p>
 * For coins = [10, 50, 100] and quantity = [1, 2, 1], the output should be
 * possibleSums(coins, quantity) = 9.
 * <p>
 * Here are all the possible sums:
 * <p>
 * 50 = 50;
 * 10 + 50 = 60;
 * 50 + 100 = 150;
 * 10 + 50 + 100 = 160;
 * 50 + 50 = 100;
 * 10 + 50 + 50 = 110;
 * 50 + 50 + 100 = 200;
 * 10 + 50 + 50 + 100 = 210;
 * 10 = 10;
 * 100 = 100;
 * 10 + 100 = 110.
 * As you can see, there are 9 distinct sums that can be created from non-empty groupings of your coins.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer coins
 * <p>
 * An array containing the values of the coins in your collection.
 * <p>
 * Guaranteed constraints:
 * 1 ≤ coins.length ≤ 20,
 * 1 ≤ coins[i] ≤ 104.
 * <p>
 * [input] array.integer quantity
 * <p>
 * An array containing the quantity of each type of coin in your collection. quantity[i] indicates the number of coins that have a value of coins[i].
 * <p>
 * Guaranteed constraints:
 * quantity.length = coins.length,
 * 1 ≤ quantity[i] ≤ 105.
 * <p>
 * It is guaranteed that (quantity[0] + 1) * (quantity[1] + 1) * ... * (quantity[quantity.length - 1] + 1) <= 106.
 * <p>
 * [output] integer
 * <p>
 * The number of different possible sums that can be created from non-empty groupings of your coins.
 */
public class PossibleSums {
    public int possibleSums(int[] coins, int[] quantity) {
        Set<Integer> map = new HashSet<>();
        map.add(0);
        for (int i = 0; i < quantity.length; i++) {
            for (Integer integer : new ArrayList<>(map)) {
                for (int j = 1; j <= quantity[i]; j++) {
                    map.add(integer + j * coins[i]);
                }
            }
        }
        return map.size() - 1;
    }

}
