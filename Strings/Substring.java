package Strings;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String() , sub;
        int len =0;
        System.out.println("Enter the string :");
        str = sc.nextLine();
        System.out.println("The string is :"+str);
        len = str.length();
        System.out.println("The string length is :"+len);
        System.out.println("The substring of ("+str+") are :-");
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                sub = str.substring(i , i+j);
                System.out.println(sub);
            }
        }
    }
}
