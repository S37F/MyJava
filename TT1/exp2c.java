package TT1;
import java.util.Scanner;
class Overload {
    void add(int x , int y){
        int z = x + y ;
        System.out.println(z);
    }
    void add(double x , double y){
        double a = x + y ;
        System.out.println(a);
    }
}
public class exp2c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overload od = new Overload();
        od.add(55,52);
        od.add(99,88);
    }
}
