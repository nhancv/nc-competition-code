import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

import codefights.challenge.Biggestplus;
import codefights.challenge.Dashes;
import codefights.challenge.Kbonacci;
import codefights.challenge.TextDisplay;
import codefights.fight.uber.ParkingSpot;
import codefights.fight.uber.PerfectCity;
import codefights.interview.hashtables.PossibleSums;
import codefights.interview.hashtables.SwapLexOrder;

public class Main {
    public static void main(String[] args) {
        SwapLexOrder test = new SwapLexOrder();
//        System.out.println(test.swapLexOrder("fixmfbhyutghwbyezkveyameoamqoi", new int[][]{
//                {8, 5},
//                {10, 8},
//                {4, 18},
//                {20, 12},
//                {5, 2},
//                {17, 2},
//                {13, 25},
//                {29, 12},
//                {22, 2},
//                {17, 11}
//        }));
//        System.out.println(test.swapLexOrder("abdc", new int[][]{
//                {1, 4},
//                {3, 4},
//        }));
        System.out.println(test.swapLexOrder("lvvyfrbhgiyexoirhunnuejzhesylojwbyatfkrv", new int[][]{
                {13, 23},
                {13, 28},
                {15, 20},
                {24, 29},
                {6, 7},
                {3, 4},
                {21, 30},
                {2, 13},
                {12, 15},
                {19, 23},
                {10, 19},
                {13, 14},
                {6, 16},
                {17, 25},
                {6, 21},
                {17, 26},
                {5, 6},
                {12, 24}
        }));
//        System.out.println(test.swapLexOrder("abcdefgh", new int[][]{
//                {1, 4},
//                {7, 8}
//        }));

//        Biggestplus b = new Biggestplus();
//        System.out.println(Arrays.toString(b.biggestplus(new int[][]{
//                {6, 8, 0, 5, 9, 6, 7, 8, 9, 7},
//                {6, 6, 0, 1, 9, 6, 7, 8, 2, 7},
//                {7, 7, 7, 7, 7, 7, 7, 7, 7, 7},
//                {6, 7, 0, 1, 7, 6, 7, 6, 7, 7},
//                {6, 6, 0, 1, 6, 6, 7, 6, 9, 7},
//                {6, 6, 0, 1, 6, 6, 7, 6, 6, 7},
//                {1, 1, 1, 1, 1, 1, 7, 1, 1, 7},
//                {8, 8, 0, 1, 6, 6, 7, 6, 6, 7},
//                {1, 1, 1, 1, 1, 1, 7, 6, 5, 7}
//        })));
//        System.out.println(Arrays.toString(b.biggestplus(new int[][]{
//                {3, 3, 3, 3, 3, 3, 3},
//                {3, 3, 3, 3, 3, 3, 3},
//                {3, 3, 3, 3, 3, 3, 3},
//                {3, 3, 3, 3, 3, 3, 3},
//                {3, 3, 3, 3, 3, 3, 3},
//                {3, 3, 3, 3, 3, 3, 3},
//                {3, 3, 3, 3, 3, 3, 3}
//        })));

    }
}
