package JavaMethods;
import java.util.Scanner ;

public class ArmstrongUsingMethods {
    public static int armstong(int num){
        int sum = 0 , rem , n ;
        n=num;
        do {
            rem = n % 10 ;
            sum += (rem*rem*rem);
            n = n / 10 ;
        } while (n>0);
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the number :");
        n = sc.nextInt();
        int res = armstong(n);
        if (n==res){
            System.out.println("The number is armstrong !");
        }
        else {
            System.out.println("The number is NOT armstong !");
        }
    }
}
