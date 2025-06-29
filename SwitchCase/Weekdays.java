package SwitchCase;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daynumber=0 ;
        System.out.print("Enter the weekday Number :");
        daynumber = sc.nextInt();
        switch (daynumber){
            case 0:
                System.out.println("Sunday!");
                break;
            case 1:
                System.out.println("Monday!");
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            default:
                System.out.println("Invalid Input ! Please enter the number btn 0 to 6");
        }
    }
}
