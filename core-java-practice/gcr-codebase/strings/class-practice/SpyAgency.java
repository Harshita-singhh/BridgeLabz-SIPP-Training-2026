// A  spy agency encodes messages. Reverse a secret message, check if it is a palindrome, count vowels/consonants, 
//and verify if two intercepts are anagrams. Extend: find the first non-repeating character in a surveillance log.
// A spy agency encodes messages and performs various string operations.

import java.util.Arrays;

public class SpyAgency {

    // Reverse the message
    public static String reverseMessage(String message) {
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }
        return reversed;
    }

    // Check if message is palindrome
    public static boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equalsIgnoreCase(reversed);
    }

    // Count vowels and consonants
    public static void countVowelsAndConsonants(String message) {
        int vowels = 0, consonants = 0;

        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    // Check if two messages are anagrams
    public static boolean areAnagrams(String msg1, String msg2) {
        msg1 = msg1.toLowerCase();
        msg2 = msg2.toLowerCase();

        char[] arr1 = msg1.toCharArray();
        char[] arr2 = msg2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Find first non-repeating character
    public static char firstNonRepeatingChar(String log) {

        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);

            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                return ch;
            }
        }

        return '\0'; // No unique character found
    }

    public static void main(String[] args) {

        String secretMessage = "madam";

        System.out.println("Original Message: " + secretMessage);
        System.out.println("Reversed Message: " + reverseMessage(secretMessage));

        if (isPalindrome(secretMessage)) {
            System.out.println("The message is a palindrome.");
        } else {
            System.out.println("The message is not a palindrome.");
        }

        countVowelsAndConsonants(secretMessage);

        String intercept1 = "listen";
        String intercept2 = "silent";

        if (areAnagrams(intercept1, intercept2)) {
            System.out.println(intercept1 + " and " + intercept2 + " are anagrams.");
        } else {
            System.out.println(intercept1 + " and " + intercept2 + " are not anagrams.");
        }

        String surveillanceLog = "swiss";

        char result = firstNonRepeatingChar(surveillanceLog);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}