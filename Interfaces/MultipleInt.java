package Interfaces;

// Interface A with a single method 'show'
interface A {
    public void show();
}

// Interface B with a single method 'show'
interface B{
    public void show() ;
}

// Class MultipleInt that implements both interfaces A and B
class MultipleInt implements A, B {
    // Implementation of the 'show' method from interface A and B
    public void show() {
        System.out.println("This is interface A & B");
    }
    // Main method to create an instance of MultipleInt and call the show method
    public static void main(String[] args) {
        MultipleInt obj = new MultipleInt() ;
        // Call the show method on the instance of MultipleInt
        obj.show();
    }
}