import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double areaInSquareCentimeters = 0.5 * base * height;

        double squareCentimetersPerSquareInch = 6.4516;
        double areaInSquareInches =
                areaInSquareCentimeters / squareCentimetersPerSquareInch;

        System.out.println("Area in square centimeters is "
                + areaInSquareCentimeters +
                " and area in square inches is "
                + areaInSquareInches);

        input.close();
    }
}