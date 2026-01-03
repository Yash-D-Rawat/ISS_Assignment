package accessModifiers.package2;

import accessModifiers.package1.Parent;

public class Test {
    public static void main(String[] args){
        Parent child = new Child2();
        System.out.println(child.publicVar);
//        System.out.println(child.protectedVar); protected variables can only be accessed through a subclass
    }
}
