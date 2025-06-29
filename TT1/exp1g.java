package TT1;
import java.util.Scanner;
public class exp1g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.println("The pattern is :");
        for (int i = 1; i <= n; i++) {
            if (i%2==0){
                for (int j = i; j >=1; j--) {    // Reverse order
                    System.out.print(j+" ");
                }
            }
            else {
                for (int j = 1; j <= i; j++) {   // Forward order
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
