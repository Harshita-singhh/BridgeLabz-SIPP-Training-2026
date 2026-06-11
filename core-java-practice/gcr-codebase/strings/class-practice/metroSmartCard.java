// MetroSmartCard.java
// Delhi Metro Smart Card Fare Deduction System

import java.util.Scanner;

public class metroSmartCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 200.0; // Initial smart card balance
        char choice;

        do {
            System.out.println("\nCurrent Balance: $" + balance);

            System.out.print("Enter distance travelled (in km): ");
            int distance = sc.nextInt();

            // Fare calculation using ternary operator
            int fare = (distance <= 5) ? 10 :
                       (distance <= 15) ? 20 :
                       (distance <= 25) ? 30 : 40;

            System.out.println("Fare = $" + fare);

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted successfully.");
                System.out.println("Remaining Balance: $" + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }

            System.out.print("Do you want to travel again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while ((choice == 'Y' || choice == 'y') && balance > 0);

        System.out.println("\nThank you for using Delhi Metro Smart Card.");

        sc.close();
    }
}