package codefights.fight.uber;

/**
 * https://codefights.com/fight/bcGYdzggbiGGWfQ9d
 * FareEstimator is building a Fare Estimator that can tell you how much your ride will cost before you request it. It works by passing approximated ride distance and ride time through this formula:
 * <p>
 * (Cost per minute) * (ride time) + (Cost per mile) * (ride distance)
 * <p>
 * where Cost per minute and Cost per mile depend on the car type.
 * <p>
 * You are one of the engineers building the Fare Estimator, so knowing cost per minute and cost per mile for each car type, as well as ride distance and ride time, return the fare estimates for all car types.
 * <p>
 * Example
 * <p>
 * For
 * ride_time = 30,
 * ride_distance = 7,
 * cost_per_minute = [0.2, 0.35, 0.4, 0.45] and
 * cost_per_mile = [1.1, 1.8, 2.3, 3.5], the output should be
 * fareEstimator(ride_time, ride_distance, cost_per_minute, cost_per_mile) = [13.7, 23.1, 28.1, 38].
 * <p>
 * Since:
 * <p>
 * 30 * 0.2 + 7 * 1.1 = 6 + 7.7 = 13.7
 * 30 * 0.35 + 7 * 1.8 = 10.5 + 12.6 = 23.1
 * 30 * 0.4 + 7 * 2.3 = 12 + 16.1 = 28.1
 * 30 * 0.45 + 7 * 3.5 = 13.5 + 24.5 = 38
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] integer ride_time
 * <p>
 * A positive integer, ride duration in minutes.
 * <p>
 * Guaranteed constraints:
 * 10 ≤ ride_time ≤ 50.
 * <p>
 * [input] integer ride_distance
 * <p>
 * A positive integer, ride distance in miles.
 * <p>
 * Guaranteed constraints:
 * 5 ≤ ride_distance ≤ 20.
 * <p>
 * [input] array.float cost_per_minute
 * <p>
 * cost_per_minute[i] is a positive number denoting cost per minute for the ith car type. There are at least 4 car types in every city where FareEstimator operates.
 * <p>
 * Guaranteed constraints:
 * 4 ≤ cost_per_minute.length ≤ 10,
 * 0.1 ≤ cost_per_minute[i] ≤ 350.0.
 * <p>
 * [input] array.float cost_per_mile
 * <p>
 * cost_per_mile[i] is a positive number denoting cost per mile for the ith car type. It is guaranteed that cost_per_minute and cost_per_mile have the same number of elements.
 * <p>
 * Guaranteed constraints:
 * cost_per_mile.length = cost_per_minute.length,
 * 0.5 ≤ cost_per_mile[i] ≤ 7.0.
 * <p>
 * [output] array.float
 * <p>
 * An array of estimated fares for each car type.
 */
public class FareEstimator {

    double[] fareEstimator(int ride_time, int ride_distance, double[] cost_per_minute, double[] cost_per_mile) {
        for (int i = 0; i < cost_per_minute.length; i++) {
            cost_per_minute[i] = cost_per_minute[i] * ride_time + cost_per_mile[i] * ride_distance;
        }
        return cost_per_minute;
    }

}
