package ControlStatement;
import java.util.Scanner;
public class Divisibleby5butNot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter the number :");
        num = sc.nextInt();
        if (num%5==0 && num%3!=0){
            System.out.println("The Number "+num+" is divisible by 5 but Not with 3 ! ");
        }
        else {
            System.out.println("NOT!");
        }
    }
}
