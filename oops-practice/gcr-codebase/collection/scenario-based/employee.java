import java.util.ArrayList;

class Employee {
    int employeeId;

    Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
    }
}

public class employee {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101));
        employees.add(new Employee(102));
        employees.add(new Employee(103));

        for (Employee emp : employees) {
            emp.display();
        }
    }
}