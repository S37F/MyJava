package Loops;
import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , a=0 , b=1 , c=0 ;
        System.out.println("Enter the limits :");
        num = sc.nextInt();
        System.out.println("The Series is :");
        for (int i = 1 ; i<=num ; i++){
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
