import java.util.Scanner;
import java.util.*;
public class exp12marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks 1 :");
        int marks = sc.nextInt();
        System.out.println("Enter marks 2 :");
        int m2 = sc.nextInt();
        System.out.println("Enter marks 3 :");
        int m3 = sc.nextInt();
        int flag;
        try{
            if (marks >100 || marks<0) {
                flag = 1 ;
                throw new MarksOutOfBoundsException(marks, flag);
            }
            else if (m2 >100 || marks<0) {
                flag = 2 ;
                throw new MarksOutOfBoundsException(m2, flag);
            }
            else if (m3 >100 || m3<0) {
                flag = 3;
                throw new MarksOutOfBoundsException(m3, flag);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
