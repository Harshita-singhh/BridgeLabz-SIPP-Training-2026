import java.io.*;
import java.util.*;

public class DailyExpenseLogger {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("expenses.txt", true));

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        bw.write(category + " - " + amount);
        bw.newLine();

        bw.close();

        System.out.println("Expense saved successfully.");
    }
}