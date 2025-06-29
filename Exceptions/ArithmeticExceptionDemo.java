public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to perform a division by zero
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("ArithmeticException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}