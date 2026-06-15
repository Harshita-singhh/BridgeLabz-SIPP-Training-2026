import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Array to store marks
        int[] marks = new int[numberOfStudents];

        // Taking marks input
        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            // Validate marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter again.");
                i--;
            }
        }

        // Initialize variables
        int highest = marks[0];
        int lowest = marks[0];
        int countAbove75 = 0;
        int sum = 0;

        // Find highest, lowest, count >75 and sum
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > highest)
                highest = marks[i];

            if (marks[i] < lowest)
                lowest = marks[i];

            if (marks[i] > 75)
                countAbove75++;

            sum += marks[i];
        }

        // Calculate average
        double average = (double) sum / marks.length;

        // Display results
        System.out.println("\nHighest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);
        System.out.println("Students scoring above 75 = " + countAbove75);
        System.out.println("Average Marks = " + average);

        // Display marks greater than average
        System.out.println("\nMarks greater than average:");

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > average)
                System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}