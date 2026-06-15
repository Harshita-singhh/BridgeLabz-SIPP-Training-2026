import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String firstString = sc.nextLine();

        System.out.print("Enter second string: ");
        String secondString = sc.nextLine();

        // Convert both strings into uppercase
        String upperFirst = firstString.toUpperCase();
        String upperSecond = secondString.toUpperCase();

        // Convert strings to character arrays
        char[] array1 = upperFirst.toCharArray();
        char[] array2 = upperSecond.toCharArray();

        // Sort arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Check anagram
        boolean isAnagram = Arrays.equals(array1, array2);

        // Display results
        System.out.println("\n----- Word Match Report -----");

        System.out.println("First String (Uppercase) : " + upperFirst);
        System.out.println("Second String (Uppercase) : " + upperSecond);

        System.out.println("Length of First String : " + firstString.length());
        System.out.println("Length of Second String : " + secondString.length());

        if (isAnagram)
            System.out.println("Both strings are Anagrams.");
        else
            System.out.println("Both strings are NOT Anagrams.");

        sc.close();
    }
}