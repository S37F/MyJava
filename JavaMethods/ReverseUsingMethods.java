package JavaMethods;
import java.util.Scanner;

public class ReverseUsingMethods {
    public static int reverse(int num){
        int rev=0 , rem ;
        do {
            rem = num % 10 ;
            rev = (rev * 10) + rem ;
            num = num / 10 ;
        }while(num>0);
        return rev ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        System.out.println("The Reverse Number :"+reverse(n));
    }
}
