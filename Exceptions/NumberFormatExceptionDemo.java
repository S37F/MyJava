public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            // Attempt to parse a string that is not a valid integer
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Parsed integer: " + num);
        } catch (NumberFormatException e) {
            // Handle the exception
            System.out.println("NumberFormatException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}