import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input
        for (int i = 0; i < salary.length; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }

        // Calculation
        for (int i = 0; i < salary.length; i++) {

            if (yearsOfService[i] > 5)
                bonusAmount[i] = salary[i] * 0.05;
            else
                bonusAmount[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}