import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of seats
        System.out.print("Enter total number of seats: ");
        int totalSeats = sc.nextInt();

        // Array to store seat status
        int[] seats = new int[totalSeats];

        // Input seat status
        System.out.println("Enter seat status (0 = Empty, 1 = Booked):");

        for (int i = 0; i < seats.length; i++) {

            System.out.print("Seat " + (i + 1) + ": ");
            seats[i] = sc.nextInt();

            // Validation
            if (seats[i] != 0 && seats[i] != 1) {
                System.out.println("Invalid input! Enter again.");
                i--;
            }
        }

        int bookedSeats = 0;
        int availableSeats = 0;

        // Variables for longest block
        int currentLength = 0;
        int longestLength = 0;

        int currentStart = 0;
        int longestStart = 0;
        int longestEnd = 0;

        // Traverse seat array
        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == 1) {
                bookedSeats++;
            }
            else {
                availableSeats++;
            }

            // Finding longest continuous block of empty seats
            if (seats[i] == 0) {

                if (currentLength == 0)
                    currentStart = i;

                currentLength++;

                if (currentLength > longestLength) {

                    longestLength = currentLength;
                    longestStart = currentStart;
                    longestEnd = i;
                }
            }
            else {
                currentLength = 0;
            }
        }

        // Display results
        System.out.println("\nTotal Booked Seats = " + bookedSeats);
        System.out.println("Total Available Seats = " + availableSeats);

        System.out.println("\nLongest Continuous Block of Available Seats:");
        System.out.println("Starting Position = " + (longestStart + 1));
        System.out.println("Ending Position = " + (longestEnd + 1));
        System.out.println("Length = " + longestLength);

        // Check for group of 5 people
        if (longestLength >= 5) {
            System.out.println("\nYes, a group of 5 people can sit together.");
        }
        else {
            System.out.println("\nNo, a group of 5 people cannot sit together.");
        }

        sc.close();
    }
}