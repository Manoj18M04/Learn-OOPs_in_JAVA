package org.example.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        String name = "Manoj";
        int age = 22;
        String mobile = "8248668763";
        Enc enc = new Enc(name, age, mobile);
        System.out.println("Name: " + enc.getName());
        System.out.println("Age: " + enc.getAge());
        System.out.println("Mobile: " + enc.getMobile());
        enc.setAge(21);
        System.out.println("Age: " + enc.getAge());
    }
}

class Enc {
    private String name;
    private int age;
    private String mobile;
    Enc(String name, int age, String mobile) {
        this.age = age;
        this.name = name;
        this.mobile = mobile;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String getMobile(){
        return mobile;
    }
    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void setMobile(String mobile){
        this.mobile = mobile;
    }
}


// Encapsulation is grouping data with methods in class
// Hiding Data, prevent direct access from outside
// Getter and Setter methods used for retrieve and modify data respectively.
// Setter method provides the control over modification of data.
