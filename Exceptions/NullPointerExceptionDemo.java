public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to dereference a null reference
            String str = null;
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            // Handle the exception
            System.out.println("NullPointerException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}