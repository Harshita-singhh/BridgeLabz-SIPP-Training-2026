import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take weight input in kg
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Take height input in cm
        System.out.print("Enter height in cm: ");
        double heightInCm = sc.nextDouble();

        // Convert cm to meters
        double heightInMeter = heightInCm / 100;

        // Calculate BMI
        double bmi = weight / (heightInMeter * heightInMeter);

        // Display BMI
        System.out.println("BMI = " + bmi);

        // Determine weight status
        if (bmi < 18.5) {
            System.out.println("Status: Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Status: Normal Weight");
        }
        else if (bmi < 30) {
            System.out.println("Status: Overweight");
        }
        else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}