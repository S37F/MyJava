package TT1;
import java.util.Scanner;
public class exp1f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the range :");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1 ; i <=n; i++) {
            sum = sum + (float)1 / (i*i) ;
        }
        System.out.println("The sum of the series is :"+sum);
    }
}
