package ExceptionHandling;
import java.util.*;
public class tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10 ;
        int j = 0 ;
        System.out.println("Enter the value of J :");
        j = sc.nextInt();
        try{
            j = i/ j ;
        }
        catch(Exception e){
            System.out.println("Something wents wrong !");
        }
        System.out.println("The value is :"+j);
    }
}
