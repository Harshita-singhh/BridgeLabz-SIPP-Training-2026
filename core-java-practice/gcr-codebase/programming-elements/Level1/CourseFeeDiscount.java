public class CourseFeeDiscount {
    public static void main(String[] args) {

        double courseFee = 125000;
        double discountPercent = 10;

        double discountAmount = courseFee * discountPercent / 100;
        double finalFee = courseFee - discountAmount;

        System.out.println("The discount amount is INR " +
                discountAmount +
                " and final discounted fee is INR " +
                finalFee);
    }
}