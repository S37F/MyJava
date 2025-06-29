package Loops;
import java.util.Scanner;
public class PrintOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter The Limits :");
        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            if (i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
