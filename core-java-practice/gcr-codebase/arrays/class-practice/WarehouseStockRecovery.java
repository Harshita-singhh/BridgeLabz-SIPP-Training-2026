import java.util.Scanner;

public class WarehouseStockRecovery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int numberOfProducts = sc.nextInt();

        // Array to store stock quantities
        int[] stock = new int[numberOfProducts];

        // Input stock values
        for (int i = 0; i < stock.length; i++) {

            System.out.print("Enter stock quantity of product " + (i + 1) + ": ");
            stock[i] = sc.nextInt();
        }

        int zeroPosition = -1;
        int sum = 0;
        int count = 0;

        // Find position of zero and sum of non-zero elements
        for (int i = 0; i < stock.length; i++) {

            if (stock[i] == 0) {
                zeroPosition = i;
            }
            else {
                sum += stock[i];
                count++;
            }
        }

        // Calculate average stock
        int averageStock = sum / count;

        // Replace zero with average
        stock[zeroPosition] = averageStock;

        // Display results
        System.out.println("\nMissing stock found at position: " + (zeroPosition + 1));
        System.out.println("Average stock of non-zero products = " + averageStock);

        System.out.println("\nUpdated Inventory:");

        for (int i = 0; i < stock.length; i++) {
            System.out.print(stock[i] + " ");
        }

        sc.close();
    }
}