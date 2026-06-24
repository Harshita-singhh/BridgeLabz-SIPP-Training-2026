class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Age=" + age + "]";
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Student [ID=" + studentId + ", GPA=" + gpa + "]";
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int studentId,
                double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", GradStudent [Thesis=" + thesis + "]";
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent(
                "Harshita", 20, 101, 8.5,
                "AI in Education");

        System.out.println(gs);

        Person p = gs;
        Student s = gs;

        System.out.println("\nIS-A Relationship Demonstration:");
        System.out.println("GradStudent IS-A Student: " + (gs instanceof Student));
        System.out.println("GradStudent IS-A Person: " + (gs instanceof Person));
    }
}