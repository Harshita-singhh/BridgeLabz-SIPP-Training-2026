import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take first number
        System.out.print("Enter first number: ");
        double firstNumber = sc.nextDouble();

        // Take second number
        System.out.print("Enter second number: ");
        double secondNumber = sc.nextDouble();

        // Take operator
        System.out.print("Enter operator (+,-,*,/): ");
        String operator = sc.next();

        // Perform operation using switch
        switch (operator) {

            case "+":
                System.out.println("Result = " + (firstNumber + secondNumber));
                break;

            case "-":
                System.out.println("Result = " + (firstNumber - secondNumber));
                break;

            case "*":
                System.out.println("Result = " + (firstNumber * secondNumber));
                break;

            case "/":
                System.out.println("Result = " + (firstNumber / secondNumber));
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}