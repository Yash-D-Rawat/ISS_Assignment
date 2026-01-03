package Collections;
// sorting according to salary in ascending order and then with name.
public class EmployeeComparable implements Comparable<EmployeeComparable> {
    String name;
    int salary;

    public EmployeeComparable(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(EmployeeComparable employee) {
        if(this.name.equals(employee.name)){
            return this.salary-employee.salary;
        }
        return this.name.compareTo(employee.name);
    }

    @Override
    public String toString(){
        return name + "@" + salary;
    }
}
