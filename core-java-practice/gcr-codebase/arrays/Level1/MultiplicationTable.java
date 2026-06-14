import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication values
        int[] table = new int[10];

        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = number * i;
        }

        // Display result
        for (int i = 1; i <= table.length; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}