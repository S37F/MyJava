package Strings;
import java.util.Scanner;
public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str , reverse = "" ;
        System.out.println("Enter the string :");
        str = sc.nextLine();
        System.out.println("the string is :"+str);
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("The reverse string is :"+reverse);
    }
}
