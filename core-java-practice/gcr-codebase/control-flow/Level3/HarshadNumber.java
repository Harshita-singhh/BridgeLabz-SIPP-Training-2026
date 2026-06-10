import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store original number
        int originalNumber = number;

        // Initialize sum
        int sum = 0;

        // Find sum of digits
        while (originalNumber != 0) {

            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        // Check Harshad number
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        }
        else {
            System.out.println(number + " is not a Harshad Number.");
        }

        sc.close();
    }
}