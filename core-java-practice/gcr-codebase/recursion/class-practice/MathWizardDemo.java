//Build a 'Math Wizard' utility class: isPrime(n), factorial(n) using iteration, fibonacci(n), gcd(a,b), lcm(a,b), and power(base, exp).
//Overload factorial to also accept double. Demonstrate scope differences between local and instance variables.

import java.util.Scanner;
public class MathWizardDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        System.out.print("Is Prime: " + result);

        int result2 = factorial(n);
        System.out.print("Factorial: " + result2);
        int result3 = fibonacci(n);
        System.out.print("Fibonacci: " + result3);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result4 = gcd(a, b);
        System.out.print("GCD: " + result4);

        int result5 = lcm(a, b);
        System.out.print("LCM: " + result5);

        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();

        int result6 = power(base, exp);
        System.out.print("Power: " + result6);
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return gcd(b, a%b);
        }
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a, b);
    }

    public static int power(int base, int exp){
        if(exp == 0){
            return 1;
        }
        else{
            return base * power(base, exp-1);
        }
    }
}
