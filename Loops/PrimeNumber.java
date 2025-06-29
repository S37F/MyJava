package Loops;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , count = 0;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        for (int i = 2 ; i < n ; i++){
            if (n%i==0){
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("The number "+n+" is prime !");
        }
        else {
            System.out.println("The number "+n+" is NOT prime !");
        }
    }
}
