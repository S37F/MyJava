package Loops;
import java.util.Scanner;
public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int sum = 0 ;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
           if (i%2==0){
               sum = sum + i ;
           }
        }
        System.out.println("The Sum of even Number is : "+sum);
    }
}
