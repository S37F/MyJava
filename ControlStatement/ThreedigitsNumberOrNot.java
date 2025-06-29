package ControlStatement;
import java.util.Scanner;
public class ThreedigitsNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        if (num>99 && num<1000){
            System.out.println("Yes ! The number "+num+" is three digits ");
        }
        else {
            System.out.println("The Number is NOT a Three digits ");
        }
    }
}
