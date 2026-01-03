package datatypes;

import java.util.Arrays;

public class Datatypes {
    public static void main(String[] args){

        // Primitive datatypes are built into Java and store values directly.

        byte b = 10;             // 1 byte
        short s = 30000;       // 2 bytes
        int integer = 5;      // 4 bytes
        long l = 10000000000L;           // 8 bytes

        float f = 10.5f;                 // 4 bytes
        double d = 20.12345;             // 8 bytes

        char c = 'A';                    // 2 bytes -> single character
        boolean flag = true;             // 1 bit -> true or false

        System.out.println("Primitive Datatypes");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + integer);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);


        // Non-primitive datatypes store references to objects and have methods.

        String name = "Yash";            // Sequence of characters (object)
        int[] arr = {1, 2, 3, 4, 5};     // Array of integers
        Integer intObj = 100;            // Wrapper class for int
        Double doubleObj = 99.99;        // Wrapper class for double

        System.out.println("\nNon-Primitive Datatypes");
        System.out.println("String: " + name);
        System.out.println("Array element at index 2: " + Arrays.toString(arr));
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
    }
}