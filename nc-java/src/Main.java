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
import codefights.fight.uber.PerfectCity;

public class Main {
    public static void main(String[] args) {
        PerfectCity test = new PerfectCity();
        System.out.println(test.perfectCity(new double[]{0.4, 1}, new double[]{0.9, 3}));
        System.out.println(test.perfectCity(new double[]{2.4, 1}, new double[]{5, 7.3}));
//        test.perfectCity(new double[]{1, 0}, new double[]{2, 1});
//        test.perfectCity(new double[]{2, 1}, new double[]{1, 0});
//        test.perfectCity(new double[]{1, 0}, new double[]{3, 1});
//        test.perfectCity(new double[]{3, 1}, new double[]{1, 0});

    }
}
