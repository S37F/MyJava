package Loops;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base ;
        System.out.println("Enter the base :");
        base = sc.nextInt();
        int power ;
        System.out.println("Enter the power :");
        power = sc.nextInt();
        int result = 1 ;
        for (int i = 1 ; i <= power; i++){
            result = result * base ;
        }
        System.out.println(base+" to the power  "+power+" = "+result);
    }
}
