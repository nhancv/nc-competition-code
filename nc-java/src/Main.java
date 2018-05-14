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

public class Main {

    public static void main(String[] args) {
        AddBorder test = new AddBorder();
        System.out.println(Arrays.toString(test.addBorder(new String[]{"abc", "ded"})));
    }
}
