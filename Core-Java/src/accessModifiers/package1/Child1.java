package accessModifiers.package1;

public class Child1 extends Parent {

    public void show(){
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
//      System.out.println("Private: " + privateVar); this is not allowed,
//      private variables can only be accessed in the same class
    }
}
