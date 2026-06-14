import java.util.Arrays;
import java.util.Scanner;

public class DynamicLargestSecondLargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = sc.next();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        for (int i = 0; i < number.length(); i++) {

            if (index == maxDigit) {

                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }

            digits[index] = number.charAt(i) - '0';
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            }
            else if (digits[i] > secondLargest && digits[i] != largest)
                secondLargest = digits[i];
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        sc.close();
    }
}