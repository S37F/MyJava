package ControlStatement;
import java.util.Scanner ;
public class AbsoluteValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter the number :");
        num = sc.nextInt();
        if (num<0){
            num *= (-1);
            System.out.println("The absolute value is :" + num);
        }
        else {
            System.out.println("The absolute value is : " + num);
        }
    }
}
