package Loops;
import java.util.Scanner;
public class PrintNumberinReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter the number :");
        num = sc.nextInt();
        for (int i=num;i>=1;i--){
            System.out.print(i+" ");
        }
    }
}