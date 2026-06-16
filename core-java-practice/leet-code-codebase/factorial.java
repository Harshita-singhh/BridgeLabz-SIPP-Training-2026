//factorial by recursion
//approach -
//1. base case - when n = 0 or n = 1, return 1
//2. recursive case - when n > 1, return n * factorial(n-1)

//pseudocode for factorial by recursion
//func fact(n):
//    if n == 0 or n == 1: return 1;
//    else: return n * fact(n-1);

import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static int  fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * fact(n-1); 
        }
    }
}

//tail recursive factorial
//approach -
//1. base case - when n = 0 or n = 1, return 1
//2. recursive case - when n > 1, return fact(n-1, n * accumulator) where accumulator is the product of n and the previous accumulator value