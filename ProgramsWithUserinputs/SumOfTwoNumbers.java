package ProgramsWithUserinputs;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  x , y;
        int res ;
        System.out.print("Enter First Number :");
        x = sc.nextInt();
        System.out.print("Enter Second Number :");
        y = sc.nextInt();
        res = x + y ;
        System.out.println("The sum Of number is : " + res);
    }
}
