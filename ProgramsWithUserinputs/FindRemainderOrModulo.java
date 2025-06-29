package ProgramsWithUserinputs;
import java.util.Scanner;
public class FindRemainderOrModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int d ;
        System.out.print("Enter First number :");
        n = sc.nextInt();
        System.out.print("Enter Second number :");
        d = sc.nextInt();
        double res = n % d ;
        System.out.println("The Remainder when " +n+ " is divided by " +d+" is : "+res);
    }
}
