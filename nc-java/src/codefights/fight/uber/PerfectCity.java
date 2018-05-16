package codefights.fight.uber;

import java.util.Vector;


/**
 * https://codefights.com/fight/bcGYdzggbiGGWfQ9d
 * Consider a city where the streets are perfectly laid out to form an infinite square grid. In this city finding the shortest path between two given points (an origin and a destination) is much easier than in other more complex cities. As a new Uber developer, you are tasked to create an algorithm that does this calculation.
 * <p>
 * Given user's departure and destination coordinates, each of them located on some street, find the length of the shortest route between them assuming that cars can only move along the streets. Each street can be represented as a straight line defined by the x = n or y = n formula, where n is an integer.
 * <p>
 * Example
 * <p>
 * For departure = [0.4, 1] and destination = [0.9, 3], the output should be
 * perfectCity(departure, destination) = 2.7.
 * <p>
 * 0.6 + 2 + 0.1 = 2.7, which is the answer.
 */
public class PerfectCity {

    boolean isInt(double x) {
        return x == Math.ceil(x);
    }

    Vector<double[]> makeVz(double z) {
        Vector<double[]> vz = new Vector<>();
        if (isInt(z)) {
            vz.add(new double[]{z, 0.0});
        } else {
            vz.add(new double[]{(double) (int) z, z - (int) z});
            vz.add(new double[]{(double) ((int) z + 1), ((int) z + 1) - z});
        }
        return vz;
    }

    double fway(double x1, double y1, double x2, double y2) {
        if (x1 == x2 && y1 == y2) return 0;
        if (x1 == x2) return y1 <= y2 ? fway(x1, y1 + 1, x2, y2) + 1 : fway(x1, y1, x2, y2 + 1) + 1;
        if (y1 == y2) return x1 <= x2 ? fway(x1 + 1, y1, x2, y2) + 1 : fway(x1, y1, x2 + 1, y2) + 1;
        return Math.min(
                x1 <= x2 ? fway(x1 + 1, y1, x2, y2) + 1 : fway(x1, y1, x2 + 1, y2) + 1,
                y1 <= y2 ? fway(x1, y1 + 1, x2, y2) + 1 : fway(x1, y1, x2, y2 + 1) + 1
        );
    }

    public double perfectCity(double[] departure, double[] destination) {
        double d = 999999999, x1 = departure[0], y1 = departure[1], x2 = destination[0], y2 = destination[1];
        Vector<double[]> vx1 = makeVz(x1);
        Vector<double[]> vy1 = makeVz(y1);
        Vector<double[]> vx2 = makeVz(x2);
        Vector<double[]> vy2 = makeVz(y2);

        for (double[] aVx1 : vx1) {
            for (double[] aVy1 : vy1) {
                for (double[] aVx2 : vx2) {
                    for (double[] aVy2 : vy2) {
                        d = Math.min(d, fway(aVx1[0], aVy1[0], aVx2[0], aVy2[0]) +
                                aVx1[1] + aVy1[1] + aVx2[1] + aVy2[1]
                        );
                    }
                }
            }
        }
        return d;
    }
}
