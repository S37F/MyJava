package Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int fact = 1 ;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        while (n>0){
            fact = fact * n ;
            n = n - 1 ;
        }
        System.out.println("The Factorial =" +fact);
    }
}
