//A kingdom's tax system charges 5% for income < 10K, 15% for 10K–50K, 30% above 50K. 
//Read a citizen's income, print tax bracket and amount. 
//Extend: loop over an array of 10 citizens and tally total tax collected.

//code for ques2.java using the above context, control flow concepts:
import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] incomes = new double[10];
        double totalTaxCollected = 0;

        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income for citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\nTAX REPORT");
        for (int i = 0; i < incomes.length; i++) {
            double tax = calculateTax(incomes[i]);
            totalTaxCollected += tax;
            System.out.printf("Citizen %d: Income = $%.2f, Tax = $%.2f%n", (i + 1), incomes[i], tax);
        }

        System.out.printf("\nTotal Tax Collected: $%.2f%n", totalTaxCollected);
    }

    public static double calculateTax(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }
}

