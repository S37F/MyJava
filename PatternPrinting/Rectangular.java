package PatternPrinting;
import java.util.Scanner;
public class Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows , col ;
        System.out.print("Enter the number of rows :");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns :");
        col = sc.nextInt();
        System.out.println("The pattern is :");
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= col ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

