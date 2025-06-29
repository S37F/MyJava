package Strings;
import java.util.Scanner;
public class Touppercase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str;
            System.out.print("Enter the string :");
            str = sc.nextLine();                     // Taking Input of a string ...
            System.out.println("The String is :" + str);
            System.out.print("Converting string to uppercase :" + str.toUpperCase());
        }
}