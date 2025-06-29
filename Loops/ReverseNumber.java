package Loops;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem , rev = 0 , n ;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        do {
            rem = n % 10 ;
            rev = ( rev * 10 ) + rem  ;
            n = n / 10 ;
        } while(n>0);
        System.out.println("The reverse number is :"+rev);
    }
}
