import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take marks input
        System.out.print("Enter Physics marks: ");
        double physicsMarks = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistryMarks = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double mathsMarks = sc.nextDouble();

        // Calculate percentage
        double averageMarks =
                (physicsMarks + chemistryMarks + mathsMarks) / 3;

        String grade;
        String remarks;

        // Decide grade and remarks
        if (averageMarks >= 90) {
            grade = "A";
            remarks = "Excellent";
        }

        else if (averageMarks >= 75) {
            grade = "B";
            remarks = "Very Good";
        }

        else if (averageMarks >= 60) {
            grade = "C";
            remarks = "Good";
        }

        else if (averageMarks >= 40) {
            grade = "D";
            remarks = "Pass";
        }

        else {
            grade = "F";
            remarks = "Fail";
        }

        // Display result
        System.out.println("Average Marks = " + averageMarks);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        sc.close();
    }
}