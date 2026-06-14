import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store ages of 10 students
        int[] ages = new int[10];

        // Taking input
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            }
            else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}