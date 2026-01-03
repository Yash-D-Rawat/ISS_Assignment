package accessModifiers.package2;

import accessModifiers.package1.Parent;

public class Child2 extends Parent {

    public void show(){
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
//        System.out.println("Default: " + defaultVar);
//        System.out.println("Private: " + privateVar);
//        Cannot access default variables out of the package
    }
}
