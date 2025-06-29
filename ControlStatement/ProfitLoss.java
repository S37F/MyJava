package ControlStatement;
import java.util.Scanner ;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp , cp ;

        System.out.print("Enter the Cost Price :");
        cp = sc.nextInt();
        System.out.print("Enter the Selling Price :");
        sp = sc.nextInt();
        int p = sp - cp ;         // To calc profit
        int l = cp - sp ;         // To calc loss
        if (sp>cp){
            System.out.print("The Seller has made profit of : " + p);
        }
        else {
            System.out.print("The Seller incurred loss of :" + l);
        }
    }
}