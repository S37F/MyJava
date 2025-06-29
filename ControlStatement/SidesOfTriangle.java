package ControlStatement;
import java.util.Scanner;
public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b , c ;
        System.out.print("Enter the 'a' sides :");
        a = sc.nextInt();
        System.out.print("Enter the 'b' sides :");
        b = sc.nextInt();
        System.out.print("Enter the 'c' sides :");
        c = sc.nextInt();
        if (a+b>c && b+c>a && a+c>b){
            System.out.println("Yes ! This Sides can make a Triangle !");
        }
        else {
            System.out.println("NOt!");
        }
    }
}
