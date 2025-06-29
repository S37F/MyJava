package JavaMethods;
import java.util.Scanner;
public class PalindromeUsingMethod {
    public static int drome(int num){
        int rev = 0 , rem  ;
        while (num != 0){
            rem = num % 10;
            rev = (rev * 10)+rem;
            num = num / 10 ;
        }
        return rev ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        int res = drome(n);
        if (res==n){
            System.out.println("Palindrome !");
        }
        else
        {
            System.out.println("NOT!");
        }
    }
}
