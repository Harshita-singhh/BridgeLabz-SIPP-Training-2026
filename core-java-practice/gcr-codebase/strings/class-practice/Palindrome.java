//code to check if a string is palindrome or not
//approach: reverse the string and compare it with the original string


public class Palindrome{
    public static void main(String[] args){
        String str = "madam";
        String reversed = " ";
        for(int i = str.length(); i>0;i--){
            reversed = reversed + str.charAt(i-1);
        }
        if(str.equals(reversed)){
            System.out.println(str + " is a palindrome.");
        }else{
            System.out.println(str + " is not a palindrome.");
        }
    }
}