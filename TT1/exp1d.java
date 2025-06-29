package TT1;
import java.util.Scanner;
public class exp1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        double n1 = sc.nextDouble();
        System.out.println("Enter 2nd number :");
        double n2 = sc.nextDouble();
        System.out.println("Enter the operator :");
        char op = sc.next().charAt(0);
        double res = 0.0 ;
        switch (op){
            case '+':
                res = n1 + n2 ;
                break;
            case '-':
                res = n1 - n2 ;
                break;
            case '*':
                res = n1 * n2 ;
                break;
            case '/':
                res = n1 / n2 ;
                break;
        }
        System.out.println(n1+" "+op+" "+n2+" "+"="+res);
    }
}
