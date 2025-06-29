package PatternPrinting;
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows ;
        System.out.println("Enter Rows :");
        rows = sc.nextInt();
        System.out.println("The Pattern is :");
        for (int i = 1 ; i <= rows ; i++) {
            for (int j = 1; j <=rows-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
