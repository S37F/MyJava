package Strings;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        System.out.print("Enter the first string :");
        str1 = sc.nextLine();
        String str2;
        System.out.print("Enter the second string :");
        str2 = sc.nextLine();
        System.out.println("The strings are :" + str1 + " and " + str2);
        int x = str1.compareTo(str2);
        System.out.println("The strings are :" + x);
    }
}

/*
 * str1 == str2 ----> return 0
 * str1 > str2 -----> return (+ve)value
 * str1 < str2 -----> return (-ve)value
 */