package Loops;
import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rem , sum = 0 , num , n ;
        System.out.println("Enter the number  :");
        num = sc.nextInt();
        n = num ;
        do {
            rem = n % 10 ;
            sum += (rem * rem * rem);
            n = n / 10 ;
        } while (n>0);
        if (sum==num){
            System.out.println("The number "+num+" is armstrong !");
        }
        else {
            System.out.println("The Number Is Not Armstrong !");
        }
    }
}
