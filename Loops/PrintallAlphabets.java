package Loops;
import java.util.Scanner;
public class PrintallAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ;
        System.out.println("The Alphabets are :");
        for (ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.print(ch+" ");
        }
        System.out.println(" ");
        for (ch = 'a' ; ch <= 'z' ; ch++){
            System.out.print(ch+" ");
        }
    }
}
