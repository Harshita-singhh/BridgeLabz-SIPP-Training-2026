import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Take years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        // Initialize bonus amount
        double bonusAmount = 0;

        // Check eligibility
        if (yearsOfService > 5) {
            bonusAmount = salary * 0.05;
        }

        // Display result
        System.out.println("Bonus Amount = " + bonusAmount);

        sc.close();
    }
}