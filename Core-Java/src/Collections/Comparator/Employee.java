package Collections.Comparator;

public class Employee {

    int id;
    String name;
    String department;
    double salary;
    int experience;

    public Employee(int id, String name, String department,
                    double salary, int experience) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department
                + " | " + salary + " | " + experience;
    }
}
