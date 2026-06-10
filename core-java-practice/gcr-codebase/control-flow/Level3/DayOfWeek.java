import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take month input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        // Take day input
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Take year input
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Calculate y0
        int y0 = year - (14 - month) / 12;

        // Calculate x
        int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);

        // Calculate m0
        int m0 = month + 12 * ((14 - month) / 12) - 2;

        // Calculate d0 (day number)
        int d0 = (day + x + (31 * m0) / 12) % 7;

        // Print day number
        System.out.println("Day number is: " + d0);

        // Print actual day name
        if (d0 == 0) {
            System.out.println("Day of the week is Sunday");
        } else if (d0 == 1) {
            System.out.println("Day of the week is Monday");
        } else if (d0 == 2) {
            System.out.println("Day of the week is Tuesday");
        } else if (d0 == 3) {
            System.out.println("Day of the week is Wednesday");
        } else if (d0 == 4) {
            System.out.println("Day of the week is Thursday");
        } else if (d0 == 5) {
            System.out.println("Day of the week is Friday");
        } else {
            System.out.println("Day of the week is Saturday");
        }

        // Close Scanner
        sc.close();
    }
}