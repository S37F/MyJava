// Using super() for invoke parent class method() . 
class School {
    // Method to print a welcome message
    void information(){
        System.out.println("Welcome to school ");
    }
}

class Student extends School {
    // Method to print a thank you message
    void information(){
        System.out.println("Thankyou!");
    }
    
    // Method to call the information method of the superclass and then the subclass
    void display(){
        information();
        super.information();
    }
}

public class in8 {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student foo = new Student();
        // Call the display method on the instance of the Student class
        foo.display();
    }
}