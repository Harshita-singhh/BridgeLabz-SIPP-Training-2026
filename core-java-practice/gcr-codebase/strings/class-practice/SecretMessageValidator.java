import java.util.Scanner;

public class SecretMessageValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input secret code
        System.out.print("Enter secret code: ");
        String code = sc.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int specialCharacters = 0;

        // Convert to lowercase for easy comparison
        String lowerCode = code.toLowerCase();

        // Traverse string
        for (int i = 0; i < lowerCode.length(); i++) {

            char ch = lowerCode.charAt(i);

            if (Character.isLetter(ch)) {

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    vowels++;
                }
                else {
                    consonants++;
                }
            }

            else if (Character.isDigit(ch)) {
                digits++;
            }

            else {
                specialCharacters++;
            }
        }

        // Check strength
        boolean isStrong = code.length() >= 8 &&
                           digits >= 2 &&
                           specialCharacters >= 1;

        // Display report
        System.out.println("\n----- Secret Code Report -----");
        System.out.println("Length = " + code.length());
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Digits = " + digits);
        System.out.println("Special Characters = " + specialCharacters);

        if (isStrong)
            System.out.println("Code Strength : Strong");
        else
            System.out.println("Code Strength : Weak");

        sc.close();
    }
}