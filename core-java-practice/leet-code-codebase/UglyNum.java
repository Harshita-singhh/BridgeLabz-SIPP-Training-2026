import java.util.*;
public class UglyNum {

    public static boolean isUgly(int n) {
        for (int i = 2; i < 6 && n > 0; i++) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isUgly(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}