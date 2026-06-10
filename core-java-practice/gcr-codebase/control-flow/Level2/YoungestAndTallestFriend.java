import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take age inputs
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        // Take height inputs
        System.out.print("Enter Amar's height: ");
        double amarHeight = sc.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = sc.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = sc.nextDouble();

        // Find youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest friend is Amar");
        }
        else if (akbarAge < anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        }
        else {
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        }
        else if (akbarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        }
        else {
            System.out.println("Tallest friend is Anthony");
        }

        sc.close();
    }
}