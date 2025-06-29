package SwitchCase;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 , num2  ;
        double res = 0.0 ;
        char op ;
        System.out.println("Enter the First Number :");
        num1 = sc.nextInt();
        System.out.println("Enter the operator :");
        op = sc.next().charAt(0);
        System.out.println("Enter the second Number :");
        num2 = sc.nextInt();
        switch (op){
            case '+':
                res = num1 + num2 ;
                break;
            case '-':
                res = num1 - num2 ;
                break;
            case '*':
                res = num1 * num2 ;
                break;
            case '/':
                res = num1 / num2 ;
                break;
            case '%':
                res = num1 % num2 ;
                break;
            default:
                System.out.println("Invalid input !");
        }
        System.out.println(num1+" "+op+" "+num2+"="+res);
    }
}
