package JavaMethods;
import java.util.Scanner;
public class PrimeNumber {
    public static int prime(int num ){
        int flag = 0 ;
        for (int i = 2; i < num ; i++) {
            if (num%i==0){
                flag++;
                break;
            }
        }
        return flag ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        int res = prime(n);
        if (res == 0){
            System.out.println("The number is prime !");
        }
        else {
            System.out.println("NOT!");
        }
    }

}
