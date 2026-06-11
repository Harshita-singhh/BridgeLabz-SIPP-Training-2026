// Program: Introduction to Strings in Java

public class StringIntroduction {
    public static void main(String[] args) {
        // 1. Creating Strings
        String name = "Harshita";
        String city = "Agra";

        System.out.println("Name: " + name);
        System.out.println("City: " + city);


        // 2. Finding Length of a String
        int length = name.length();
        System.out.println("Length of name: " + length);


        // 3. Converting to Uppercase and Lowercase
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());


        // 4. Accessing Characters using charAt()
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Third Character: " + name.charAt(2));


        // 5. Comparing Strings
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "Python";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));


        // 6. Concatenating Strings
        String firstName = "Harshita";
        String lastName = "Singh";

        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);


        // 7. Checking if String Contains a Character or Word
        String language = "Java Programming";

        System.out.println("Contains 'Java': " + language.contains("Java"));
        System.out.println("Contains 'Python': " + language.contains("Python"));


        // 8. Finding Index of a Character
        System.out.println("Index of 'P': " + language.indexOf('P'));


        // 9. Extracting a Substring
        System.out.println("Substring: " + language.substring(5));
        System.out.println("Substring (0 to 4): " + language.substring(0, 4));


        // 10. Replacing Characters or Words
        String sentence = "I love Java";

        System.out.println(sentence.replace("Java", "Python"));


        // 11. Checking Start and End of String
        System.out.println(language.startsWith("Java"));
        System.out.println(language.endsWith("ing"));


        // 12. Removing Extra Spaces
        String text = "   Hello World   ";

        System.out.println("Before Trim: '" + text + "'");
        System.out.println("After Trim: '" + text.trim() + "'");


        // 13. Converting String to Character Array
        char[] chars = name.toCharArray();

        System.out.println("Characters in name:");
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}