package ControlStatement;
import java.util.Scanner;
public class Divisibleby5or3butNotby15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Enter the number :");
        num = sc.nextInt();
        /*if (num%5==0 || num%3==0){            // With Nested if-else
            if (num%15!=0){
                System.out.println("The number "+num+" Is divisible by 5 or 3 but not with 15.");
            }
            else
            {
                System.out.println("Not Valid !");
            }
        }
        else
        {
            System.out.println("NOT valid !");
        }*/

        if ((num%5==0 || num%3==0) && num%15!=0){                 // Without Nested if-else
            System.out.println("The number "+num+" Is divisible by 5 or 3 but not with 15.");
        }
        else
        {
            System.out.println("Not Valid !");
        }
    }
}
