import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store original number
        int originalNumber = number;

        // Initialize digit counter
        int count = 0;

        // Count digits using loop
        while (originalNumber != 0) {
            originalNumber = originalNumber / 10;
            count++;
        }

        // Handle case when number is 0
        if (number == 0) {
            count = 1;
        }

        // Display result
        System.out.println("Number of digits = " + count);

        sc.close();
    }
}