package ProgramsWithUserinputs;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius ;
        double pi = 3.1415 ;
        System.out.print("Enter the radius :");
        radius = sc.nextInt();
        System.out.println("The Value of Pi : " + pi);
        double res = pi * radius * radius ;
        System.out.println("The Area of Circle is :" + res );
    }
}
