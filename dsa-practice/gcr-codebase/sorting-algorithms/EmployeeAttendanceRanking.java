import java.util.*;

class Employee {
    int id;
    int attendance;

    Employee(int id, int attendance) {
        this.id = id;
        this.attendance = attendance;
    }
}

public class EmployeeAttendanceRanking {

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        Employee[] employees = new Employee[employeeIds.length];

        for (int i = 0; i < employeeIds.length; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                if (e1.attendance != e2.attendance) {
                    return e2.attendance - e1.attendance;
                }

                return e1.id - e2.id;
            }
        });

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = employees[i].id;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] attendance = new int[n];

        System.out.println("Enter Employee IDs:");

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        System.out.println("Enter Attendance Percentages:");

        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int[] top = topKEmployees(ids, attendance, k);

        System.out.println("Top " + k + " Employees:");

        for (int id : top) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}