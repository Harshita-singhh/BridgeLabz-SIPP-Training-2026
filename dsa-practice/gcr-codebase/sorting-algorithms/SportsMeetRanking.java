import java.util.Arrays;

public class SportsMeetRanking {

    static void bubbleSort(int[] arr) {

        int swaps = 0;
        boolean sorted = true;

        System.out.println("Bubble Sort Passes:");

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped)
                break;

            sorted = false;
        }

        System.out.println("Total Swaps = " + swaps);

        if (sorted)
            System.out.println("Already Sorted (Best Case)");
    }

    static void insertionSort(int[] arr) {

        System.out.println("\nInsertion Sort Passes:");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    static void top3(int[] arr) {

        int[] copy = arr.clone();
        Arrays.sort(copy);

        System.out.println("\nTop 3 Medalists:");

        for (int i = copy.length - 1; i >= copy.length - 3; i--) {
            System.out.println(copy[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};

        bubbleSort(arr.clone());

        insertionSort(arr.clone());

        top3(arr);
    }
}