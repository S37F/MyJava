// Using super() for invoke parent class constructor() . 
class House {
    // Constructor for the House class
    House(){
        System.out.println("This is house!");
    }
}

class TV extends House {
    // Constructor for the TV class
    TV(){
        // Call the constructor of the superclass
        super();
        System.out.println("This is TV");
    }
}

class Coffee extends TV {
    // Constructor for the Coffee class
    Coffee(){
        // Call the constructor of the superclass
        super();
        System.out.println("Love watching TV");
    }
}

public class in7 {
    public static void main(String[] args) {
        // Create an instance of the Coffee class
        new Coffee();
    }
}