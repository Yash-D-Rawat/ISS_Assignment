package strings_arrays;
//This code cover the basics of strings with some string functions and using stringbuilder.

import java.util.Scanner;

public class StringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String string = sc.nextLine(); // Necessary for taking multiple words and many lines.
        // sc.next() would only take string up to stop words.
        System.out.println(string);
        System.out.println("Length: " + string.length());
        System.out.println("Uppercase: " + string.toUpperCase());
        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("Character at index 1: " + string.charAt(1));
        System.out.println("Substring (1,5): " + string.substring(1,5));
        System.out.println("Contains 'World'? " + string.contains("World")); //case-sensitive
        System.out.println("Replace: " + string.replace("World", "Java"));

        string = "Yash"; //Reassign is allowed but string are immutable in java
        //string.charAt(0) = 'y'; throws error
        String a = "Yash";
        String b = "Yash";
        String c = new String("Yash");

        System.out.println(a == b);  // true  → checks reference
        System.out.println(a == c);  // false → because "new" creates new object
        System.out.println(a.equals(c)); // true → checks value


        //StringBuilder - allows to modify strings
        String s = "hello";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.toString());
        sb.append(" World");   // Hello World
        sb.insert(5, " Java"); // Hello Java World
        sb.replace(0, 5, "Hi"); // Hi Java World
        sb.delete(2, 7);  // deletes characters from index 2 to 6
        sb.reverse();
        System.out.println(sb);

    }
}
