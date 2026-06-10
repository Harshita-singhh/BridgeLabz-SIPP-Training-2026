import java.util.Scanner;

public class UserFeeDiscountCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fee: ");
        double courseFee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        double discountAmount = courseFee * discountPercent / 100;
        double finalFee = courseFee - discountAmount;

        System.out.println("The discount amount is INR " +
                discountAmount +
                " and final discounted fee is INR " +
                finalFee);

        sc.close();
    }
}