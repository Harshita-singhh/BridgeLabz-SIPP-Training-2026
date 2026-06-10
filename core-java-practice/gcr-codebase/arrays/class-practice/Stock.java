//A warehouse stores item quantities in an array. Find the max, min,total stock, and detect duplicates. 
//Extend: rotate the stock array by k positions (simulate daily shift handover), and transpose a 2D shelf grid.
import java.util.Arrays;

public class Stock {

    public static void main(String[] args) {
        int[] itemStock = {45, 20, 60, 20, 90, 15, 60};

        findMinMax(itemStock);
        findTotal(itemStock);
        searchItem(itemStock, 90);
        findDuplicates(itemStock);

        // Rotate array by 2 positions
        int[] rotated = rotatedArray(itemStock, 2);
        System.out.println("Rotated Array: " + Arrays.toString(rotated));

        // 2D shelf grid
        int[][] shelf = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        transposeMatrix(shelf);
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void findTotal(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        System.out.println("Total stock: " + total);
    }

    public static void searchItem(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("Item found at index: " + i);
                return;
            }
        }

        System.out.println("Item not found");
    }

    public static void findDuplicates(int[] arr) {
        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }

    public static int[] rotatedArray(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        return rotated;
    }

    public static void transposeMatrix(int[][] matrix) {
        System.out.println("Transposed Matrix:");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}