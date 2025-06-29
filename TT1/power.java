package TT1;
import java.util.Scanner;
public class power {
    public static int pow(int a , int b){
        if (b==0 || b==1){
            return 1;
        }
        else {
            return a*pow(a,b-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =2;
        int n=2;
        pow(x,n);
    }
}
