import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for positive number
        if (number > 0) {

            // Print odd and even numbers
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}