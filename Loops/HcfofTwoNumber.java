package Loops;
import java.util.Scanner;
public class HcfofTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 , n2 ;
        System.out.println("Enter first number :");
        n1 =sc.nextInt();
        System.out.println("Enter second number :");
        n2 = sc.nextInt();
        int rem , hcf = 0 ;
        do {
            rem = n1 % n2 ;
            if (rem==0){
                hcf = n2 ;
            }
            else {
                n1 = n2 ;
                n2 = rem ;
            }
        }while (rem!=0);
        System.out.println("HCF="+hcf);
    }
}
