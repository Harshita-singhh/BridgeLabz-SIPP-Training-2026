
//climbing stairs by recursion
//storing the calculated values in a memoization array to avoid redundant calculations and improve efficiency
//approach -
//1. base case - when n = 0, return 1; when n = 1, return 1
//2. recursive case - when n > 1, return climbStairs(n-1) + climbStairs(n-2) where climbStairs(n-1) represents the number of ways to climb n-1 stairs and climbStairs(n-2) represents the number of ways to climb n-2 stairs. The total number of ways to climb n stairs is the sum of these two values.
//pseudocode for climbing stairs by recursion
//use hashmap to store the calculated values for each n to avoid redundant calculations and improve efficiency
//func climbStairs(n, memo):
//    if n in memo: return memo[n];
//    if n == 0: return 1;
//    if n == 1: return 1;
//    memo[n] = climbStairs(n-1, memo) + climbStairs(n-2, memo);
//code - 





import java.util.*;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of ways = " + climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n == 0 || n == 1)
            return 1;

        int prev2 = 1; // ways for 0 stairs
        int prev1 = 1; // ways for 1 stair

        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}