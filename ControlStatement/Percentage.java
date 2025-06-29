package ControlStatement;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 , s2 , s3 , s4 , s5 ;
        System.out.println("Enter Marks of Physics :");
        s1 = sc.nextInt();
        System.out.println("Enter Marks of Chemistry :");
        s2 = sc.nextInt();
        System.out.println("Enter Marks of Maths :");
        s3 = sc.nextInt();
        System.out.println("Enter Marks of IT :");
        s4 = sc.nextInt();
        System.out.println("Enter Marks of English :");
        s5 = sc.nextInt();
        double per = (s1 + s2 + s3 + s4 + s5)/5;
        System.out.println("your Percentage :" + per);
        if (per > 90){
            System.out.println("Excellent!");
        }
        else if (per > 80) {
            System.out.println("VeryGood!");
        }
        else if (per > 70) {
            System.out.println("Good!");
        }
        else if (per > 60) {
            System.out.println("Can Do Better!");
        }
        else if (per > 50) {
            System.out.println("Average!");
        }
        else if (per > 40) {
            System.out.println("Below Average!");
        }
        else if (per > 30) {
            System.out.println("Fail :( ");
        }
    }
}
