package Strings;
import java.util.Scanner;
public class CopyStrintoAnotherStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        System.out.println("Enter string :");
        str = sc.nextLine();
        System.out.println("Copying string :");
        StringBuffer strcpy = new StringBuffer(str);
        System.out.println("String copied successfully ...!");
        System.out.println("The copied string is :"+ strcpy);
    }
}
