import java.util.Scanner;

public class FactorsUsingWhileLoop {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        // Initialize counter
        int counter = 1;

        // Check positive number
        if (number > 0) {

            // Find factors using while loop
            while (counter < number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter++;
            }
        }
        else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}