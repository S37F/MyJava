package Loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , rev = 0 , rem , original=0 ;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        original = num;
        do {
            rem = num % 10 ;
            rev = (rev * 10) + rem ;
            num = num / 10 ;
        }while (num>0);
        if (rev==original){
            System.out.println("The Number is palindrome !");
        }
        else {
            System.out.println("NOT!");
        }
    }
}
