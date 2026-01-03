package Collections;

import java.util.ArrayList;
import java.util.List;

// List collection and its methods
public class ListDemo {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // add()
        students.add(new Student(1, "Yash"));
        students.add(new Student(2, "Soham"));
        students.add(new Student(3, "Rahul"));

        System.out.println("Initial List:");
        printList(students);

        // add(index, element)
        students.add(1, new Student(4, "Amit"));
        System.out.println("\nAfter add at index 1:");
        printList(students);

        // get(index)
        System.out.println("\nElement at index 2: " + students.get(2));

        // set(index, element)
        students.set(0, new Student(1, "Yash Updated"));
        System.out.println("\nAfter set at index 0:");
        printList(students);

        // contains()
        System.out.println("\nContains Student(2, Soham): "
                + students.contains(new Student(2, "Soham")));

        // remove(index)
        students.remove(1);
        System.out.println("\nAfter remove index 1:");
        printList(students);

        // size()
        System.out.println("\nList size: " + students.size());

        // isEmpty()
        System.out.println("Is list empty? " + students.isEmpty());

        // clear()
        students.clear();
        System.out.println("\nAfter clear:");
        System.out.println("Is list empty? " + students.isEmpty());
    }

    private static void printList(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
