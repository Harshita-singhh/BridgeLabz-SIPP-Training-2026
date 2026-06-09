public class q1281 {

    public static int subtractProductAndSum(int n) {
        int dsum = 0;
        int dproduct = 1;

        while (n > 0) {
            int digit = n % 10;
            dsum += digit;
            dproduct *= digit;
            n /= 10;
        }

        return dproduct - dsum;
    }

    public static void main(String[] args) {
        int n = 234;

        System.out.println("Result: " + subtractProductAndSum(n));
    }
}