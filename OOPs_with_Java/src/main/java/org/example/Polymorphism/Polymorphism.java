package org.example.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Runtime Polymorphism");
        DynamicParent parent = new DynamicParent();
        DynamicParent child = new DynamicChild();
        parent.print();
        child.print();

        System.out.println();
        System.out.println("Compile-Time Polymorphism");
        StaticPolymorphism sp = new StaticPolymorphism();
        sp.print(10);
        sp.print("Hello World");
    }
}

class DynamicParent {
    void print() {
        System.out.println("I am DynamicParent");
    }
}

class DynamicChild extends DynamicParent {
    void print() {
        System.out.println("I am DynamicChild");
    }
}

class StaticPolymorphism {
    void print(int n) {
        System.out.println("The number is: " + n);
    }
    void print(String s) {
        System.out.println("The string is: " + s);
    }
}

// Ability of methods to take more than one form
// Two types:
// Dynamic -> Runtime, Superclass and Subclass have same method, Overriding
// {Same function with same return type and arguments}
// Static -> CompileTime, Many methods with same name but different arguments in the same class, Overloading