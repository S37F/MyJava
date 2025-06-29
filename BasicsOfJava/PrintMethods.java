package BasicsOfJava;

public class PrintMethods {
    public static void main(String[] args) {
        int x  = 10 , y = 19 , z = 5 ;

        // Long method ....

        /*System.out.print("the value of x : ");
        System.out.println(x);
        System.out.print("the value of y : ");
        System.out.println(y);
        System.out.print("the value of z : ");
        System.out.println(z);*/

        /* Short method  ....(Using '+') help while printing
        between a (text) and a (number) */

        System.out.println("The value of x :" + x);
        System.out.println("The value of y :" + y);
        System.out.println("The value of z :" + z);
        System.out.println(" ");
        System.out.println("Without using brackets the results is :" + x+y+z);    // output ---> 10195

        // please use brackets () while performing arithmetic operations

        System.out.println(" ");
        System.out.println("The addition of x and z :" + (x + z));
        System.out.println("The subtraction of y and z :" + (y - z));
        System.out.println("The multiplication of x and y :" + (x * y));
        System.out.println("The division of x and z : " + (x / z));

    }
}
