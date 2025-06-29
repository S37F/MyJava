package Loops;
import java.util.Scanner;
public class SumOfAllEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , sum = 0 ;
        System.out.print("Enter the N Number to get the sum of even numbers :");
        n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            if (n%2==0){
                sum = sum + n ;
            }
        }
        System.out.println(sum+" ");
    }
}
