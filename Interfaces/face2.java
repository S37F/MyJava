package Interfaces ;
import java.util.Scanner;

// Interface Cleint with two methods 'input' and 'output'
interface Cleint{
    // Method 'input' for taking input from the user
    void input();
    // Method 'output' for displaying the output
    void output();
}

// Class 'face2' that implements the 'Cleint' interface
class face2 implements Cleint{
    // Declaring the instance variables
    String name;
    int id;
    double sal;
    // Creating an object of Scanner class for taking input
    Scanner sc = new Scanner(System.in);
    
    // Implementation of the 'input' method from the 'Cleint' interface
    public void input(){
        System.out.println("Enter the username :");
        // Taking string input
        name = sc.nextLine();
        System.out.println("Enter the user id :");
        // Taking integer input
        id = sc.nextInt();
        System.out.println("Enter the salary :");
        // Taking double input
        sal = sc.nextDouble();
    }
    // Implementation of the 'output' method from the 'Cleint' interface
    public void output(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(sal);
    }
    // Main method to create an object of 'face2' class and call the 'input' and 'output' methods
    public static void main(String[] args) {
        face2 f = new face2();
        // Calling the 'input' method on the object of 'face2' class
        f.input();
        // Calling the 'output' method on the object of 'face2' class
        f.output();
    }
}