import java.util.Scanner;
public class exeption {

    // public static void main(String[] args) {
    //     try {
    //         int a = 10;
    //         int b = 0;
    //         int c = a / b;
    //         System.out.println(c);
    //     } catch (Exception e) {
    //         System.out.println("Exception Handled");
    //     } finally {
    //         System.out.println("Finally Block Executed");
    //     }
    // }

    //null pointer exception
    // public static void main(String[] args) {
    //     try {
    //         String text = null;
    //         System.out.println(text.length());
    //     } catch (NullPointerException e) {
    //         System.out.println("NullPointerException Handled");
    //     }
    // }



    //checked exception
    //explaination - 
    //it is not checked at runtime, so it is not handled by the compiler, so we need to handle it using try-catch blocks
    //example -
    //FileInputStream file = new FileInputStream("file.txt");
    //System.out.println("File Opened");
    //FileNotFoundException is a checked exception, so we need to handle it using try-catch blocks
    //IOException is a checked exception, so we need to handle it using try-catch blocks


    // public static void main(String[] args) {
    //     try {
    //         FileInputStream file = new FileInputStream("file.txt");
    //         System.out.println("File Opened");
    //     } catch (FileNotFoundException e) {
    //         System.out.println("FileNotFoundException Handled");
    //     }
    // }


    // static void calculateTotal(){
    //     File fr = new File("abc");
    //     FileReader fr = new FileReader(fr);
    // }


    static void method(){
        Scanner sc = new Scanner(System.in);
        try {
            int x= sc.nextInt();
        
        } finally{
            sc.close();
        }
    }
}