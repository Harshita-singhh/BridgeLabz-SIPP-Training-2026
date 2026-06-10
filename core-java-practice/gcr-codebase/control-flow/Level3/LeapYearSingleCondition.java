import java.util.Scanner;

public class LeapYearSingleCondition {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Single if condition using logical operators
        if (year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {

            System.out.println(year + " is a Leap Year.");
        }

        else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close();
    }
}