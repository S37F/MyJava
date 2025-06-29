package TT1;
import java.util.Scanner;
public class exp1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject1 :");
        double s1 = sc.nextDouble();
        System.out.println("Enter marks of subject2 :");
        double s2 = sc.nextDouble();
        System.out.println("Enter marks of subject3 :");
        double s3 = sc.nextDouble();
        System.out.println("Enter marks of subject4 :");
        double s4 = sc.nextDouble();
        System.out.println("Enter marks of subject5 :");
        double s5 = sc.nextDouble();
        double per = (s1+s2+s3+s4+s5)/5;
        System.out.println("The percentage is :"+per+"%");
        if (per >= 90) {
            System.out.println("Grade : Excellent !");
        }
        else if (per >= 80) {
            System.out.println("Grade : Very Good !");
        } else if (per >= 70) {
            System.out.println("Grade : Good !");
        } else if (per >= 60) {
            System.out.println("Grade : Average !");
        }
        else if (per >= 50) {
            System.out.println("Grade : Can Do Better !");
        }
        else if (per >= 40) {
            System.out.println("Grade : Fail !");
        }
    }
}
