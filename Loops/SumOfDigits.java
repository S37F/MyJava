package Loops;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, rem;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        do {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        } while (n != 0);
        System.out.println("The sum of digits of is = "+sum);
    }
}
