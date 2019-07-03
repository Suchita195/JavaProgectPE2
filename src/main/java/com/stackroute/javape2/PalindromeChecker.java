package com.stackroute.javape2;
import java.util.*;

public class PalindromeChecker {
    public static String palindromeChecker(String original) {
        String reverse = "";
        int length = original.length();
        for (int index = length - 1; index >= 0; index--)
            reverse = reverse + original.charAt(index);
        if (original.equals(reverse))//checking if original is equal to reverse
            return "Entered string/number is a palindrome.";
        else
            return "Entered string/number isn't a palindrome.";
    }
}

