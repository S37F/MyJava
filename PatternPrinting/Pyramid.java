package PatternPrinting;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows ;
        System.out.print("Enter the rows:");
        rows = sc.nextInt();
        System.out.println("The pattern is : ");
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
