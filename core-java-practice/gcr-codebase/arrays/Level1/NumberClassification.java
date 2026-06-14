import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of size 5
        int[] numbers = new int[5];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Classification
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                if (numbers[i] % 2 == 0)
                    System.out.println(numbers[i] + " is Positive and Even");
                else
                    System.out.println(numbers[i] + " is Positive and Odd");

            }
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            }
            else {
                System.out.println("Zero");
            }
        }

        // Comparing first and last element
        if (numbers[0] > numbers[numbers.length - 1])
            System.out.println("First element is greater.");
        else if (numbers[0] < numbers[numbers.length - 1])
            System.out.println("First element is smaller.");
        else
            System.out.println("Both are equal.");

        sc.close();
    }
}