import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

import codefights.arcade.intro.AddBorder;
import codefights.arcade.intro.CommonCharacterCount;
import codefights.arcade.intro.IsLucky;
import codefights.arcade.intro.ReverseParentheses;
import codefights.challenge.TextDisplay;

public class Main {

    public static void main(String[] args) {
        TextDisplay test = new TextDisplay();
        System.out.println(test.textDisplay(new int[]{72, 69, 89, 32, 89, 79, 85, 32, 68, 73, 68, 32, 73, 84, 32, 87, 82, 79, 78, 71, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 188, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 46, 46, 8, 8, 46, 46, 8}));
        System.out.println(test.textDisplay(new int[]{65, 78, 89, 84, 72, 73, 78, 71, 32, 73, 83, 32, 80, 79, 83, 83, 73, 66, 76, 69, 39, 39, 39, 39, 39, 39, 39, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 186, 32, 37, 37, 37, 37, 37, 37, 37, 37, 37, 39, 37, 37, 66, 69, 32, 89, 79, 85, 82, 83, 69, 76, 70, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 39, 39, 76, 73, 69, 86, 69, 37, 37, 39, 39, 39, 73, 78, 32, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 39, 37, 37, 37, 37, 37, 37, 37, 37, 37, 8, 188}));
    }
}
