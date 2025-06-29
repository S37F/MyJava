package PatternPrinting;
import java.util.Scanner;
public class FloydsTriangleDownRightside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows ;
        System.out.println("Enter the number of rows :");
        rows = sc.nextInt();
        System.out.println("The pattern is :");
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <=(rows+1-i) ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
