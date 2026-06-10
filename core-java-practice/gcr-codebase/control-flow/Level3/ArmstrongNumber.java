import java.util.Scanner;

public class ArmstrongNumber {
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

        // Find cube of each digit
        while (originalNumber != 0) {

            // Get last digit
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum = sum + digit * digit * digit;

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Check Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        }

        else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        sc.close();
    }
}