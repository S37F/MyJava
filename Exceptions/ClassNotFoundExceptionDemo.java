public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that doesn't exist
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Handle the exception
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}