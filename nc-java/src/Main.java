import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
import java.text.*;
import java.security.SecureRandom;
import java.util.function.*;
import java.util.concurrent.*;

import codefights.arcade.intro.CommonCharacterCount;
import codefights.arcade.intro.IsLucky;

public class Main {

    public static void main(String[] args) {
        IsLucky isLucky = new IsLucky();
        System.out.println(isLucky.isLucky(239017));
    }
}
