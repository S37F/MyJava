package ControlStatement;
import java.util.Scanner;
public class Areaandperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area , peri , l , b ;
        System.out.print("Enter the length of rectangle :");
        l = sc.nextInt();
        System.out.print("Enter the breath of the rectangle :");
        b = sc.nextInt();
        area = l * b ;
        peri = 2*(l+b);
        System.out.println("area is : " + area);
        System.out.println("Perimeter is :" + peri);
        if (area>peri){
            System.out.println("Area is greater !");
        }
        else if (peri>area) {
                System.out.println("Perimeter is greater !");
        }
        else{
            System.out.println("They both are equal !");
        }
    }
}
