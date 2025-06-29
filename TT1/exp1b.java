package TT1;
import java.util.*;
public class exp1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max ;
        max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The largest number is :"+max);
    }
}
