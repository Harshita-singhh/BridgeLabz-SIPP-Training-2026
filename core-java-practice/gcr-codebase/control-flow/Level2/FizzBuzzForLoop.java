import java.util.Scanner;

public class FizzBuzzForLoop {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Check positive number
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }

                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }

                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }

                else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}