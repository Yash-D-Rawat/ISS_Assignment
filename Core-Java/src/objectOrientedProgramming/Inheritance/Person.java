package objectOrientedProgramming.Inheritance;
// this code features concepts of classes, objects, constructors, final keywword, methods.

public class Person {
    String name;
    int age;
    final String country = "India";

    // Non - parameterized constructor
    public Person(){
        this.name = "Yash";
        this.age = 21;
    }

    //parameterized constructor
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void showName(){
        System.out.println("My name is " + this.name);
    }

    public int returnAge(){
        return this.age;
    }

    public void description(){
        System.out.println("My name is " + this.name);
        System.out.println("My age is: " + this.age);
    }
}
