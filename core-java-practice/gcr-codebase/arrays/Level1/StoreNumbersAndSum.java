import java.util.Scanner;

public class StoreNumbersAndSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {

            if (index == numbers.length)
                break;

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            if (value <= 0)
                break;

            numbers[index] = value;
            index++;
        }

        // Display numbers and calculate sum
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total = " + total);

        sc.close();
    }
}