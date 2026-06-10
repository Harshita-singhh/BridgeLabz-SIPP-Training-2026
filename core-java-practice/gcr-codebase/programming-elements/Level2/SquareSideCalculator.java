import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();

        double sideLength = perimeter / 4;

        System.out.println("The length of the side is "
                + sideLength
                + " whose perimeter is "
                + perimeter);

        input.close();
    }
}