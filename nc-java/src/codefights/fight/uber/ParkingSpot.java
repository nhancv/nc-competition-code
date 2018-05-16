package codefights.fight.uber;

/**
 * https://codefights.com/fight/bcGYdzggbiGGWfQ9d
 * This time you are an Uber driver and you are trying your best to park your car in a parking lot.
 * <p>
 * Your car has length carDimensions[0] and width carDimensions[1]. You have already picked your lucky spot (rectangle of the same size as the car with upper left corner at (luckySpot[0], luckySpot[1])) and bottom right corner at (luckySpot[2], luckySpot[3]) and you need to find out if it's possible to park there or not.
 * <p>
 * It is possible to park your car at a given spot if and only if you can drive through the parking lot without any turns to your lucky spot (for safety reasons, the car can only move in two directions inside the parking lot - forwards or backwards along the long side of the car) starting from some side of the lot (all four sides are valid options).
 * <p>
 * Naturally, you can't park your car if the lucky spot is already occupied. The car can't drive through or park at any of the occupied spots.
 * <p>
 * Example
 * <p>
 * For carDimensions = [3, 2],
 * <p>
 * parkingLot = [[1, 0, 1, 0, 1, 0],
 * [0, 0, 0, 0, 1, 0],
 * [0, 0, 0, 0, 0, 1],
 * [1, 0, 1, 1, 1, 1]]
 * and
 * luckySpot = [1, 1, 2, 3], the output should be
 * parkingSpot(carDimensions, parkingLot, luckySpot) = true.
 * <p>
 * <p>
 * <p>
 * For carDimensions = [3, 2],
 * <p>
 * parkingLot = [[1, 0, 1, 0, 1, 0],
 * [1, 0, 0, 0, 1, 0],
 * [0, 0, 0, 0, 0, 1],
 * [1, 0, 0, 0, 1, 1]]
 * and
 * luckySpot = [1, 1, 2, 3], the output should be
 * parkingSpot(carDimensions, parkingLot, luckySpot) = false;
 * <p>
 * For carDimensions = [4, 1],
 * the same parkingLot as in the previous example and
 * luckySpot = [0, 3, 3, 3], the output should be
 * parkingSpot(carDimensions, parkingLot, luckySpot) = true.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer carDimensions
 * <p>
 * Array of two positive integers. It is guaranteed that carDimensions[0] > carDimensions[1].
 * <p>
 * Guaranteed constraints:
 * 1 ≤ carDimensions[i] ≤ 10.
 * <p>
 * [input] array.array.integer parkingLot
 * <p>
 * 2-dimensional array, where parkingLot[x][y] is 1 if cell (x, y) is occupied and is 0 otherwise.
 * <p>
 * Guaranteed constraints:
 * 3 ≤ parkingLot.length ≤ 10,
 * 3 ≤ parkingLot[0].length ≤ 10.
 * <p>
 * [input] array.integer luckySpot
 * <p>
 * Array of four integers - coordinates of your lucky spot at the parking lot.
 * It is guaranteed that one of the following statements is true:
 * <p>
 * luckySpot[2] - luckySpot[0] + 1 = carDimensions[0] and
 * luckySpot[3] - luckySpot[1] + 1 = carDimensions[1];
 * luckySpot[2] - luckySpot[0] + 1 = carDimensions[1] and
 * luckySpot[3] - luckySpot[1] + 1 = carDimensions[0].
 * Guaranteed constraints:
 * 0 ≤ luckySpot[0] ≤ luckySpot[2] < parkingLot.length,
 * 0 ≤ luckySpot[1] ≤ luckySpot[3] < parkingLot[i].length.
 * <p>
 * [output] boolean
 * <p>
 * true if it is possible to park your car, false otherwise.
 */
public class ParkingSpot {

    boolean checkBlock(int[][] parkingLot, int i1, int i2, int j1, int j2) {
        for (int i = i1; i <= i2; i++) {
            for (int j = j1; j <= j2; j++) {
                if (parkingLot[i][j] > 0) return false;
            }
        }
        return true;
    }

    public boolean parkingSpot(int[] carDimensions, int[][] parkingLot, int[] luckySpot) {
        int t = luckySpot[0], l = luckySpot[1], b = luckySpot[2], r = luckySpot[3];
        int iend = parkingLot.length - 1, jend = parkingLot[0].length - 1;
        int w = r - l + 1, h = b - t + 1;
        boolean checkSpot = checkBlock(parkingLot, t, b, l, r);
        if (w >= h) {
            return checkSpot && (checkBlock(parkingLot, t, b, 0, l - 1) || checkBlock(parkingLot, t, b, r + 1, jend));
        } else {
            return checkSpot && (checkBlock(parkingLot, 0, t - 1, l, r) || checkBlock(parkingLot, b + 1, iend, l, r));
        }
    }
}
