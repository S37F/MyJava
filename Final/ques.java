package Final;
import java.util.*;
final class ques{
    final static double rate = 5 ;
    static int principle , time ;
    final static void simple(){
        double s ;
        s = (principle * time * rate ) / 100 ;
        System.out.println("The simple interest is ="+s);
    }
    final static void compound(double n){
        double c ;
        c = principle*(Math.pow(1+(rate/n*100), (n*time)));
        System.out.println("the compound ="+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n ;
        System.out.println("Enter time and principle :");
        principle = sc.nextInt();
        time=sc.nextInt();
        simple();
        System.out.println("Enter the time you want to pay :");
        n = sc.nextDouble();
        compound(n);   
    }
}

