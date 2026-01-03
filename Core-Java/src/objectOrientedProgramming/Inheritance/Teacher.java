package objectOrientedProgramming.Inheritance;

public class Teacher extends Person {
    int teacherId;
    String subject;

    public Teacher(String name, int age, int teacherId, String subject) {
        super(name, age);   // calling parent constructor
        this.teacherId = teacherId;
        this.subject = subject;
    }

    @Override
    public void description(){
        super.description();
        System.out.println("Teacher details: " + "\nname: " + this.name + "\nage: " + this.age + "\nTeacherId: " + this.teacherId + "\nTeaches: " + subject);
    }

}
