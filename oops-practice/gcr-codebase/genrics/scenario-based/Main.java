import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Pair<T,U>
        System.out.println("----- Pair -----");
        pair<String, Integer> pair = new pair<>("Harshita", 101);
        pair.display();

        // Generic Stack<T>
        System.out.println("\n----- Stack -----");
        Sta<String> stack = new Sta<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("SQL");

        stack.display();

        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop : " + stack.pop());

        stack.display();

        // Generic Method findMax()
        System.out.println("\n----- Find Max -----");

        Integer[] numbers = {10, 25, 90, 45, 18};

        System.out.println("Maximum = " +
                GenericUtility.findMax(numbers));

        // Generic Repository<T>
        System.out.println("\n----- Repository -----");

        Repository<Student> repository = new Repository<>();

        repository.add(new Student(101, "Harshita"));
        repository.add(new Student(102, "Rahul"));
        repository.add(new Student(103, "Priya"));

        repository.display();

        // Wildcard List<?>
        System.out.println("\n----- Wildcard -----");

        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        GenericUtility.printList(names);
    }
}