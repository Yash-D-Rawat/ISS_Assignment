package objectOrientedProgramming.Inheritance;

public class Main {

    public static void demoForBasics() {

        System.out.println("Creating two Person objects using parameterized constructor");

        Person p1 = new Person("Yash", 21);
        Person p2 = new Person("Soham", 21);

        System.out.println("\nCalling methods on Person objects");

        p1.showName();
        System.out.println("Returned age from method: " + p1.returnAge());

        p2.showName();
        System.out.println("Returned age from method: " + p2.returnAge());

        System.out.println("\nAccessing final variable 'country'");
        System.out.println("Country (cannot be changed): " + p1.country);

        System.out.println("\nModifying non-final variable 'age'");
        p1.age = 22;
        System.out.println("Updated age after modification: " + p1.returnAge());

        System.out.println("Final variables cannot be reassigned, so country remains unchanged");
    }

    public static void demoForInheritance() {

        System.out.println("Creating Student and Teacher objects using Person reference");
        System.out.println("This demonstrates hierarchical inheritance");

        Person student = new Student("Yash", 21, 101, 88, 92.5);
        Person teacher = new Teacher("Dr. Sharma", 45, 201, "Data Structures");

        System.out.println("\nCalling overridden method description() using Person reference");
        System.out.println("Method call is resolved at runtime based on object type");

        System.out.println("\nStudent object calls its overridden version of description()");
        student.description();

        System.out.println("\nTeacher object calls its overridden version of description()");
        teacher.description();

    }

    public static void main(String[] args) {

        System.out.println("----- DEMO 1: BASIC OOP CONCEPTS (Class, Object, Methods, Final) -----");
        demoForBasics();

        System.out.println("\n\n----- DEMO 2: INHERITANCE AND POLYMORPHISM -----");
        demoForInheritance();
    }
}
