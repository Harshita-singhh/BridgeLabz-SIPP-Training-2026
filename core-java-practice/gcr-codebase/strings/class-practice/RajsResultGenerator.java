// RajsResultGenerator.java

import java.util.Scanner;

public class RajsResultGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int marks;

        // Input marks for 5 subjects
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            marks = sc.nextInt();
            total += marks;
        }

        // Calculate average
        double average = total / 5.0;

        // Determine grade category
        int gradeCategory;

        if (average >= 90) {
            gradeCategory = 1;
        } else if (average >= 80) {
            gradeCategory = 2;
        } else if (average >= 70) {
            gradeCategory = 3;
        } else if (average >= 60) {
            gradeCategory = 4;
        } else {
            gradeCategory = 5;
        }

        // Assign grade using switch
        switch (gradeCategory) {
            case 1:
                System.out.println("Grade: A");
                break;
            case 2:
                System.out.println("Grade: B");
                break;
            case 3:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }

        System.out.println("Average Marks = " + average);

        sc.close();
    }
}