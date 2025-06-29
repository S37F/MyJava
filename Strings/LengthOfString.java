package Strings;
import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.println("Enter the string :");
        str = sc.nextLine();                     // Taking Input of a string ...
        System.out.println("The String is :"+str);
        int len ;
        len = str.length();                      // To find length of string ...
        System.out.println("The string length is : "+len);
    }
}
