package Strings;
import java.util.Scanner ;
public class IndexOfstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.print("Enter a string :");
        str = sc.nextLine();
        System.out.println("The string is :"+str);
        char ch ;
        System.out.print("Enter any character to get the index :");
        ch = sc.next().charAt(0);                          // Taking input of character
        int x = str.indexOf(ch);               // get the index of string
        System.out.print("The index of "+ch+" is : "+x);
    }
}
