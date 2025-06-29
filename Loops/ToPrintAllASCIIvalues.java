package Loops;
import java.util.Scanner;
public class ToPrintAllASCIIvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch ;
        System.out.println("The ASCII values are :");
        for (ch = 1 ; ch <= 225 ; ch ++){
            System.out.print((char)ch+" ");
        }
    }
}
