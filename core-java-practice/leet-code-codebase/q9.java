public class q9 {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int original = x;

        while (x > 0) {
            reverse = reverse * 10 + (x % 10);
            x /= 10;
        }

        return reverse == original;
    }

    public static void main(String[] args) {
        int num = 121;

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}