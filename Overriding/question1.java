package Overriding;

class Person{
    // Method to print a message
    void work(){
        System.out.println("This is Parent class");
    }
}

class teacher extends Person{
    // Method to print a message
    // Indicates that the method is intended to override a method in the superclass
    void work(){
        System.out.println("This is teacher class");
    }
}

class student extends teacher{
    // Method to print a message
    // Indicates that the method is intended to override a method in the superclass
    void work(){
        System.out.println("This is student class");
    }
}

public class question1{
    public static void main(String[] args) {
        // Create an instance of the teacher class and assign it to a variable of type Person
        Person t = new teacher();
        // Create an instance of the student class and assign it to a variable of type Person
        Person s = new student();
        // Call the work method on the instance of the teacher class
        t.work();
        // Call the work method on the instance of the student class
        s.work();
    }
}

/*
Dynamic method dispatch is a technique
which enables us to assign the base class
reference to a child class object.

syntax :-
base_class obj_name = new child_1class();
base_class obj_name = new child_2class();

here we have to make the obj as per are classes 
*/