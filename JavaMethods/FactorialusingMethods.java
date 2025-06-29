package JavaMethods;
import java.util.Scanner;
public class FactorialusingMethods {
    public static int factorial(int n){
        int fact = 1 ;
        do {
            fact = fact * n ;
            n = n - 1 ;
        }while (n > 0);
        return fact ;
    }
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        n = sc.nextInt();
        int ans =factorial(n);
        System.out.println("The factorial is ="+ans);
    }
}
