package ControlStatement;
import java.util.Scanner;
public class GrreatestOfthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        System.out.print("Enter the first number :");
        a = sc.nextInt();
        System.out.print("Enter the second number :");
        b = sc.nextInt();
        System.out.print("Enter the Third number :");
        c = sc.nextInt();
        if (a>b && a>c){
            System.out.println("The number "+a+" Is Greatest !");
        }
        else if (b>a && b>c) {
            System.out.println("The number "+b+" Is Greatest !");
        }
        else {
            System.out.println("The number "+c+" Is Greatest !");
        }
    }
}
