package Strings;

import java.util.Scanner;

public class Concatenation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 ;
            System.out.print("Enter first string :");
            str1 = sc.nextLine();
            String str2 ;
            System.out.print("Enter second string :");
            str2 = sc.nextLine();
            System.out.print("Concatenation of two strings are :"+str1.concat(str2));
        }
}
