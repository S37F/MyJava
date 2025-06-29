package TT1;
import java.util.Scanner;
public class exp1h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int n = sc.nextInt();
        int a=65;
        int x=1;
        for (int i = 1; i <= n ; i++) {     // main loop
            for (int j = n; j > i ; j--) {     // for creating spaces
                System.out.print(" ");
            }
            int b=a ;
            for (int k = 0; k < i; k++) {       // for printing alphabets
                System.out.print((char)b);
                b--;
            }
            a = a + (++x);
            System.out.println();
        }
    }
}
