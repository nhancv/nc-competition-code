import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

import codefights.challenge.Kbonacci;
import codefights.challenge.TextDisplay;

public class Main {
    public static void main(String[] args) {
        Kbonacci test = new Kbonacci();
        System.out.println(test.kbonacci(2, 10));
//        System.out.println(test.kbonacci(1001, 25000));
    }
}
