// Using super() for calling parent class instance varaible 
class Aaa {
    // Class variable 'b' is initialized to 69
    int b = 69;
}

class Bbb extends Aaa {
    // Class variable 'b' is initialized to 88, hiding the 'b' variable in the superclass
    int b = 88;
    
    // Method to display the value of the 'b' variable from the superclass
    void display(){
        // Use the 'super' keyword to access the 'b' variable in the superclass
        System.out.println("The value is "+super.b);
    }
}

public class in6 {
    public static void main(String args[]) {
        // Create an instance of the Bbb class
        Bbb o = new Bbb();
        // Call the display method on the instance of the Bbb class
        o.display();
    }
}