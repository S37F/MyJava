package JavaMethods;
import java.util.Scanner;
public class SumOfTwoNumber {
    public static int add(int a , int b){
        int sum = a + b ;
        return sum ;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 , n2 ;
        System.out.print("Enter first number :");
        n1 = sc.nextInt();
        System.out.print("Enter second number ");
        n2 = sc.nextInt();
        int plus = add(n1,n2);
        System.out.println("The Answer is :"+plus);
    }
}