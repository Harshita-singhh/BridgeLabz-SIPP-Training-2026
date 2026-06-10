public class NumOfSteps {

    public static int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 14;

        int result = numberOfSteps(num);

        System.out.println("Number: " + num);
        System.out.println("Steps to reduce to zero: " + result);
    }
}