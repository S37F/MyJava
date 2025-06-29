package Maths;
import java.util.Scanner;
public class straightline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=1 , y1=1 , x2=2 , y2=2 , x3=3 , y3=3 ;
        int res1 ;
        res1 = (y2-y1)/(x2-x1);
        int res2 ;
        res2 = (y3-y2)/(x3-x2);
        if (res1==res2){
            System.out.println("The three points fall on one straight line !");
        }
        else {
            System.out.println("Not Valid Points !");
        }
    }
}
