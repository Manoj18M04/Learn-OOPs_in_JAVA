package org.example.Classes_and_Objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        Person p = new Person();
//        Person is a class and p is an object.
        p.name = name;
        p.age = age + 5;
        System.out.println("Name: " + p.name);
        System.out.println("Age in main: " + age);
        System.out.println("Age: " + p.age);
    }
}

class Person {
    String name;
    int age;
}

//  object is nothing but storing complex data,
//  while complex data is nothing but the group of different primitive datatypes

// object is an instance of class.
// class is a template for an object.