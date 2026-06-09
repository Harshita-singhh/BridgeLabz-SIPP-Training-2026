// Ravi just joined a coding guild. 
// Store his name, age, rank, salary, and membership fee (float) using correct data types.  
// Compute his annual bonus (12% of salary), cast it to int, and print a formatted welcome card.

public class ques1 {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 22;
        String rank = "Gold";
        double salary = 50000;
        float membershipFee = 1500.50f;

        double bonus = salary * 0.12;
        
        int annualBonus = (int) bonus;

        System.out.println("WELCOME CARD");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : $" + salary);
        System.out.println("Membership Fee : $" + membershipFee);
        System.out.println("Annual Bonus   : $" + annualBonus);
        System.out.println("Welcome to the Coding Guild, " + name + "!");
    }
}