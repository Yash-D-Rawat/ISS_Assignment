package objectOrientedProgramming.Inheritance;
// In order to implement Encapsulation this code uses student details (that is modified by teachers) as an example.
// This also implements inheritance of Hierarchical level

public class Student extends Person {
    private int UID;
    private int marks;
    private double attendance;

    //Constructor Overloading
    public Student(int UID, int marks, double attendance){
        this.UID = UID;
        this.marks = marks;
        this.attendance = attendance;
    }

    //Constructor Overloading
    public Student(String name, int age, int UID, int marks, double attendance) {
        super(name, age);   // calling parent constructor
        this.UID = UID;
        this.marks = marks;
        this.attendance = attendance;
    }


//    getters and setter for accessing and modifying private variables.
    public int getUID() {
        return UID;
    }

    public int getMarks() {
        return marks;
    }

    public double getAttendance() {
        return attendance;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    @Override
    public void description(){
        super.description();
        System.out.println("Student details: " + "\nname: " + this.name + "\nage: " + this.age + "\nStudentId: " + this.UID + "\nMarks: " + this.marks);
    }


}
