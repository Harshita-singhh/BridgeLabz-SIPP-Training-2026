//types of methods - 
//1. void method - does not return any value
//2. non-void method - returns a value
//3. static method - can be called without creating an object of the class
//4. non-static method - can only be called by creating an object of the class
//5. parameterized method - takes parameters as input
//6. non-parameterized method - does not take any parameters as input
//7. recursive method - calls itself
//8. overloaded method - same method name but different parameters
//9. overridden method - same method name and parameters but different implementation in subclass
//10. abstract method - declared without implementation in abstract class
//11. final method - cannot be overridden in subclass   
//12. synchronized method - used in multithreading to control access to a method by multiple threads

//public, private, protected, and default are access modifiers in java
//public - can be accessed from anywhere
//private - can only be accessed within the class
//protected - can be accessed within the package and by subclasses
//default - can be accessed within the package only

//recursion
//tco - tail call optimization - when the recursive call is the last operation in the function, the compiler can optimize it to avoid stack overflow
//base case - the condition under which the recursion will stop
//recursive case - the condition under which the recursion will continue


//factorial by recursion
//approach -
//1. base case - when n = 0 or n = 1, return 1
//2. recursive case - when n > 1, return n * factorial(n-1)

//pseudocode for factorial by recursion
//func fact(n):
//    if n == 0 or n == 1: return 1;
//    else: return n * fact(n-1);

import java.util.Scanner;
public class notes{
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