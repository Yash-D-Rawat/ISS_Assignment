package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();

        // put()
        studentMap.put(1, new Student(1, "Yash"));
        studentMap.put(2, new Student(2, "Soham"));
        studentMap.put(3, new Student(3, "Rahul"));

        System.out.println("Initial Map:");
        printMap(studentMap);

        // get()
        System.out.println("\nGet key 2: " + studentMap.get(2));

        // containsKey()
        System.out.println("\nContains key 3? " + studentMap.containsKey(3));

        // containsValue()
        System.out.println("Contains value Student(1, Yash)? "
                + studentMap.containsValue(new Student(1, "Yash")));

        // remove()
        studentMap.remove(2);
        System.out.println("\nAfter remove key 2:");
        printMap(studentMap);

        // replace()
        studentMap.replace(1, new Student(1, "Yash Updated"));
        System.out.println("\nAfter replace key 1:");
        printMap(studentMap);

        // size()
        System.out.println("\nMap size: " + studentMap.size());

        // isEmpty()
        System.out.println("Is map empty? " + studentMap.isEmpty());

        // clear()
        studentMap.clear();
        System.out.println("\nAfter clear:");
        System.out.println("Is map empty? " + studentMap.isEmpty());
    }

    private static void printMap(Map<Integer, Student> map) {
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
