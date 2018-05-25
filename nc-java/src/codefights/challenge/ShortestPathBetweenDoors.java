package codefights.challenge;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * https://codefights.com/challenge/FRvDNjYNZFDdjkTyb
 * You're a famous treasure hunter who collects artifacts from all around the world. On your most recent quest, you've entered a dungeon to collect an ancient artifact. You have a map of each floor, so you are able to avoid all the deadly traps easily. Once you reach the bottom, you pick up the artifact, but suddenly, the entire dungeon begins collapsing! You must now leave the dungeon as quickly as possible while still avoiding the traps!
 * <p>
 * Given a two dimensional array which represents the map of the dungeon, return the length of the shortest path between the two doors. The path may only move in the four cardinal directions (left, right, up, down), and cannot touch any trap. Each tile you would have to move counts towards your path length, so a path between two adjacent doors has a length of 1. You have already traveled through the dungeon, so you know that there is always a possible route.
 * <p>
 * Examples
 * <p>
 * For
 * map =  [[0, 0, 0, 0],
 * [2, 0, 1, 0],
 * [0, 1, 0, 0],
 * [1, 0, 2, 0]]
 * the output should be shortestPathBetweenDoors(map) = 8.
 * <p>
 * If the above is the dungeon floor, a path must be drawn around the traps in the center. There are a few similar routes, but they will all look something like this:
 * <p>
 * [[⇨,⇨,⇨,⇩],
 * [2, 0, 1,⇩],
 * [0, 1, 0,⇩],
 * [1, 0, 2,⇦]]
 * Note that starting from the other door gives you the same result, just backwards. You must move 8 squares to reach your destination, so the output should be 8.
 * <p>
 * For
 * map = [[0, 0],
 * [2, 2]]
 * the output should be shortestPathBetweenDoors(map) = 1.
 * <p>
 * The exits are right next to each other, so you only need to move 1 tile to reach one door from the other.
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.array.integer map
 * <p>
 * A matrix of integers representing the dungeon. A 0 represents a floor tile, which you may use in your path. A 1 represents a trap and must be avoided. A 2 represents a door, which you enter and exit the floor from. There will always be exactly two doors on the map. No other numbers will be in the array.
 * <p>
 * Guaranteed constraints:
 * 2 ≤ map.length ≤ 1000
 * 2 ≤ map[i].length ≤ 1000
 * 0 ≤ map[i][j] ≤ 2
 * <p>
 * [output] integer
 * <p>
 * The length of the shortest possible path between the two doors on the map. The path must travel only in the cardinal directions and avoid traps.
 */
public class ShortestPathBetweenDoors {

    class P {
        int u, v;

        P(int i, int j) {
            u = i;
            v = j;
        }
    }

    int H, W, c, i, j;

    boolean f(int[][] m, int i, int j) {
        return i >= 0 & i < H & j >= 0 & j < W && m[i][j] != 1;
    }

    public int shortestPathBetweenDoors(int[][] m) {
        H = m.length;
        W = m[0].length;
        int[] p[] = new int[H][W], t = new int[4];
        for (i = 0; i < H & c < 2; i++)
            for (j = 0; j < W & c < 2; j++)
                if (m[i][j] == 2) {
                    t[c * 2] = i;
                    t[c * 2 + 1] = j;
                    c++;
                }

        Queue<P> q = new ArrayDeque<>();
        q.add(new P(t[0], t[1]));
        while (!q.isEmpty()) {
            P a = q.poll();
            i = a.u;
            j = a.v;
            p[i][j]++;
            if (i == t[2] && j == t[3]) {
                return p[t[2]][t[3]] - 1;
            }
            if (f(m, i - 1, j) && p[i - 1][j] < 1) {
                p[i - 1][j] += p[i][j];
                q.add((new P(i - 1, j)));
            }
            if (f(m, i, j - 1) && p[i][j - 1] < 1) {
                p[i][j - 1] += p[i][j];
                q.add((new P(i, j - 1)));
            }
            if (f(m, i + 1, j) && p[i + 1][j] < 1) {
                p[i + 1][j] += p[i][j];
                q.add((new P(i + 1, j)));
            }
            if (f(m, i, j + 1) && p[i][j + 1] < 1) {
                p[i][j + 1] += p[i][j];
                q.add((new P(i, j + 1)));
            }
        }
        return p[t[2]][t[3]] - 1;
    }

}
