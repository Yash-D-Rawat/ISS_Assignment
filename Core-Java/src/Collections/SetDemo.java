package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        // add()
        students.add(new Student(1, "Yash"));
        students.add(new Student(2, "Soham"));
        students.add(new Student(1, "Yash")); // duplicate

        System.out.println("Initial Set:");
        for (Student s : students) {
            System.out.println(s);
        }

        // size()
        System.out.println("\nTotal students: " + students.size());

        // contains()
        System.out.println("\nContains Student(1, Yash): "
                + students.contains(new Student(1, "Yash")));

        // remove()
        students.remove(new Student(2, "Soham"));
        System.out.println("\nAfter removing Student(2, Soham):");
        for (Student s : students) {
            System.out.println(s);
        }

        // isEmpty()
        System.out.println("\nIs set empty? " + students.isEmpty());

        // addAll()
        Set<Student> newStudents = new HashSet<>();
        newStudents.add(new Student(3, "Rahul"));
        newStudents.add(new Student(4, "Amit"));

        students.addAll(newStudents);
        System.out.println("\nAfter addAll():");
        for (Student s : students) {
            System.out.println(s);
        }

        // removeAll()
        students.removeAll(newStudents);
        System.out.println("\nAfter removeAll():");
        for (Student s : students) {
            System.out.println(s);
        }

        // clear()
        students.clear();
        System.out.println("\nAfter clear():");
        System.out.println("Is set empty? " + students.isEmpty());
    }
}
