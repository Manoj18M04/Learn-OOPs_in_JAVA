package org.example.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Manoj";
        emp.empId = 210031;
        emp.position = "Engineer";
        Employee emp2 = new Manager();
        emp2.name = "John";
        emp2.empId = 210032;
        emp2.position = "Engineer";
        emp.print();
        emp2.print();
    }
}

class Employee {
    String name;
    int empId;
    String position;
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Position: " + position);
    }
}

class Manager extends Employee {
    final String position = "Manager";
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Position: " + position);
    }
}

// Allows classes to use data and method from another class