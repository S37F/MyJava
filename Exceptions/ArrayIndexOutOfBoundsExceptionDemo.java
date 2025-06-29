public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to access an element at an index that is out of bounds
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 3: " + arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}