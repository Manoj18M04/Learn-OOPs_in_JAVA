package org.example.Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        String name = "Kong";
        Animal animal = new Dog(name);
        animal.eat();
    }
}

abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
//    eat() method is abstract as it shows the interface but the implementation is present only in dog class.
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    void eat() {
        System.out.println(name + " eat");
    }
}

// only show essential data / detail, hide all other details

// For eg, in mobile phone,
// the app interface and UI are visible whereas the driver code and other os files are hidden for security concerns.
// for using the mobile phone, there is no need to know about the driver settings. That is kind of Abstraction.
// Interface -> Shown outside the class
// Implementation -> Hidden from outside