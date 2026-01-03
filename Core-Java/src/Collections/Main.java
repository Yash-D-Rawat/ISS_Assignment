package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// This main function is to run the comparable

public class Main {
    public static void main(String[] args){
        List<EmployeeComparable> employee = new ArrayList<>();

        employee.add(new EmployeeComparable("Yash", 10000));
        employee.add(new EmployeeComparable("Soham", 10000));
        employee.add(new EmployeeComparable("Yash", 50000));
        employee.add(new EmployeeComparable("Jheel", 10000));

        System.out.println("Before Sorting: ");
        for (EmployeeComparable e: employee){
            System.out.println(e);
        }

        Collections.sort(employee);

        System.out.println("\nAfter Sorting:");
        for (EmployeeComparable e: employee){
            System.out.println(e);
        }
    }
}
