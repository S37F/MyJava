package ControlStatement;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter a Number :");
        num = sc.nextInt();
        if (num%5==0){
            System.out.println(num+" the number is divisible by 5");
        }
        else {
            System.out.println(num+ " the number is NOT divisible by 5 ");
        }
    }
}

