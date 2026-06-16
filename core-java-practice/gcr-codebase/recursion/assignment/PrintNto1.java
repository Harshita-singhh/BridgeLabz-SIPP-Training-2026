public class PrintNto1 {

    public static void printNumbers(int n) {
        // Base case
        if (n == 0)
            return;

        // Recursive case
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}