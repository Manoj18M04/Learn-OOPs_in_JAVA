package org.example.Inheritance.Access_Modifiers;

public class AccessModifiers {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.pub);
        System.out.println(b.pro); // Not accessible if outside the package
//        System.out.println(b.pri); // not accessible
        b.publicMethod();
        b.protectedMethod(); // Not Accessible if outside the package
//        b.privateMethod(); // Not Accessible
        b.access();
    }
}

class A {
    public String pub = "I am public !";
    protected String pro = "I am protected !";
    private String pri = "I am private !";
    public void publicMethod() {
        System.out.println(pub);
    }
    protected void protectedMethod() {
        System.out.println(pro);
    }
    private void privateMethod() {
        System.out.println(pri);
    }
}

class B extends A {
    public void access() {
        System.out.println(pub);
        System.out.println(pro);
//        System.out.println(pri); // Not Accessible
        publicMethod();
        protectedMethod();
//        privateMethod(); // Not Accessible
    }
}


// Changes where class data can be accessed from
// public -> members can be accessed from anywhere.
// protected -> members can only be accessed within the class, its parent class and the inherited class.
// private -> members can be accessed only by the class that defines them.