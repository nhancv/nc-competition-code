import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

import codefights.challenge.Dashes;
import codefights.challenge.Kbonacci;
import codefights.challenge.TextDisplay;
import codefights.fight.uber.ParkingSpot;
import codefights.fight.uber.PerfectCity;

public class Main {
    public static void main(String[] args) {
        ParkingSpot test = new ParkingSpot();

        System.out.println(test.parkingSpot(
                new int[]{4, 1},
                new int[][]{
                        {1, 0, 1, 0, 1, 0},
                        {1, 0, 0, 0, 1, 0},
                        {0, 0, 0, 0, 0, 1},
                        {1, 0, 0, 0, 1, 1},
                },
                new int[]{0, 3, 3, 3}));

        System.out.println(test.parkingSpot(
                new int[]{4, 2},
                new int[][]{
                        {0,0,0,1},
                        {0,0,0,0},
                        {0,0,1,1}
                },
                new int[]{0, 0, 1, 3}));


    }
}
