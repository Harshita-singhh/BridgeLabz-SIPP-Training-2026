class Student {
    // Static variable (shared by all students)
    static String college = "ABC College";

    // Non-static variables (unique for each student)
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("John", 20);
        Student s2 = new Student("Jane", 21);

        s1.display();
        s2.display();
    }
}