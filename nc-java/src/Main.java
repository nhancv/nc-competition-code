import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

import codefights.interview.trees.KthLargestInBST;
import codefights.interview.trees.Tree;

public class Main {


    public static void main(String[] args) {
        KthLargestInBST test = new KthLargestInBST();

//        Tree<Integer> t = new Tree<>(3);
//        t.left = new Tree<>(1);
//        t.right = new Tree<>(5);
//        t.right.left = new Tree<>(4);
//        t.right.right = new Tree<>(6);
//
//        System.out.println(test.kthLargestInBST(t, 4));

        Tree<Integer> t = new Tree<>(1);
        t.left = new Tree<>(-1);
        t.left.left = new Tree<>(-2);
        t.left.right = new Tree<>(0);

        System.out.println(test.kthLargestInBST(t, 1));

    }
}
