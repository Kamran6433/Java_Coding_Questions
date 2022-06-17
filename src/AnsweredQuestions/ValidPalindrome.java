package AnsweredQuestions;

import java.util.ArrayList;

// A phrase is a palindrome if, after converting all uppercase letters into
// lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
//
// Given a string s, return true if it is a palindrome, or false otherwise.
public class ValidPalindrome {

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {

        String cleanedString = s.replaceAll("[^A-Za-z0-9]", "");
        System.out.println("Cleaned String: " + cleanedString);
        String newString = cleanedString.toLowerCase();
        System.out.println("New String: " + newString);
        ArrayList<Character> forwardPosition = new ArrayList<>();
        ArrayList<Character> backwardsPosition = new ArrayList<>();
        char[] newStringArray = newString.toCharArray();

        for (int i = 0; i < newStringArray.length; i++) {
            forwardPosition.add(newStringArray[i]);
        }
        System.out.println();

        for (int j = newStringArray.length - 1; j > -1; j--) {
            backwardsPosition.add(newStringArray[j]);
        }

        System.out.println(forwardPosition.equals(backwardsPosition));
        return forwardPosition.equals(backwardsPosition);
    }
}
