import java.util.Scanner;

public class UsernameValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input username
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Check for spaces
        boolean hasSpace = username.contains(" ");

        // Count characters
        int length = username.length();

        // Convert to uppercase
        String upperCaseUsername = username.toUpperCase();

        // Check palindrome
        String reverse = "";

        for (int i = length - 1; i >= 0; i--) {
            reverse += username.charAt(i);
        }

        boolean isPalindrome = username.equalsIgnoreCase(reverse);

        // Display results
        System.out.println("\n----- Username Report -----");

        if (hasSpace)
            System.out.println("Username contains spaces.");
        else
            System.out.println("Username does not contain spaces.");

        System.out.println("Total characters = " + length);
        System.out.println("Uppercase username = " + upperCaseUsername);

        if (isPalindrome)
            System.out.println("Username is a palindrome.");
        else
            System.out.println("Username is not a palindrome.");

        sc.close();
    }
}