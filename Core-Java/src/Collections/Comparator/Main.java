package Collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Amit", "IT", 70000, 5));
        employees.add(new Employee(2, "Rahul", "HR", 50000, 8));
        employees.add(new Employee(3, "Soham", "IT", 90000, 3));
        employees.add(new Employee(4, "Yash", "HR", 50000, 10));

        Collections.sort(employees, new EmployeeComparator());

        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}
