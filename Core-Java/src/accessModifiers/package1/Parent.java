package accessModifiers.package1;
// This is the main parent class which holds all the variables, and we will test the accessibility
// in child1, child2, test classes.
public class Parent {
    public int publicVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30;
    int defaultVar = 40;

//    in same class we can access everything
    public void show(){
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}


