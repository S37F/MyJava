package Loops;
import java.util.Scanner;
public class Printnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter the number :");
        num = sc.nextInt();
        for (int i = 1; i<num ; i++ ){
            System.out.print( i+" " );
        }
    }
}
