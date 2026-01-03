package Collections;
//This is a custom student object used by the collections.
public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Needed for Set & Map key comparison
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}