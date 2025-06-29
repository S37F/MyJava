package ProgramsWithUserinputs;
import java.util.Scanner;
public class ToFindASCIIvalues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ;
        System.out.print("Enter an character to check the ASCII value :");
        ch = sc.next().charAt(0);               // user input of Char data type
        int x = ch ;                            // formula to find ascii value ..
        System.out.print("The ASCII Value is :" + x);
    }
}
