package com.stackroute.javape2;
import java.util.*;

public class PalindromeChecker {
    public static String palindromeChecker(String original) {
        String reverse = ""; // Objects of String class
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            return "Entered string/number is a palindrome.";
        else
            return "Entered string/number isn't a palindrome.";
    }
}

