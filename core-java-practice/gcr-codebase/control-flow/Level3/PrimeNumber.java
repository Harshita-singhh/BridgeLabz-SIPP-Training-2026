import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Assume number is prime
        boolean isPrime = true;

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            isPrime = false;
        }

        // Check divisibility
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        }

        else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close();
    }
}