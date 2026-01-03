package Collections.Comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        // 1. Sort by department (ascending)
        int deptCompare = e1.department.compareTo(e2.department);
        if (deptCompare != 0) {
            return deptCompare;
        }

        // 2. Sort by salary (descending)
        int salaryCompare = Double.compare(e2.salary, e1.salary);
        if (salaryCompare != 0) {
            return salaryCompare;
        }

        // 3. Sort by experience (descending)
        return Integer.compare(e2.experience, e1.experience);
    }
}
