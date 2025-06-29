package TT1;
import java.util.Scanner ;
public class exp1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(n%2!=0)
            System.out.println("Weird");
        if(n>=2 && n<=5)
            System.out.println("Not Weird");
        if(n>=20 && n<= 6)
            System.out.println("Weird");
        if(n>20)
            System.out.println("Not Weird");
    }
}
