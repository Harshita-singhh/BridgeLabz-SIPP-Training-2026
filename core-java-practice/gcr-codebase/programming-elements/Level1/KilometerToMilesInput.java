import java.util.Scanner;

public class KilometerToMilesInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double distanceInKilometers = sc.nextDouble();

        double kilometersPerMile = 1.6;
        double distanceInMiles = distanceInKilometers / kilometersPerMile;

        System.out.println("The total miles is " +
                distanceInMiles +
                " mile for the given " +
                distanceInKilometers +
                " km");

        sc.close();
    }
}