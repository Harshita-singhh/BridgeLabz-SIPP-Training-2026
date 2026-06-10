import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Distance in yards is "
                + distanceInYards +
                " and distance in miles is "
                + distanceInMiles);

        input.close();
    }
}