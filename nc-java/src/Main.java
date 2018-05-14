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
        System.out.println(test.textDisplay(new int[]{87, 72, 65, 84, 222, 83, 32, 37, 37, 37, 35, 39, 85, 80, 36, 69, 89, 37, 37, 37, 72, 39, 39, 32}));
    }
}
