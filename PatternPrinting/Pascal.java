package PatternPrinting;
import java.util.Scanner;
public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row ;
        System.out.println("Enter row :");
        row = sc.nextInt();
        System.out.println("The Pattern is :");
        for (int i = 1; i <= row ; i++) {                            // Main loop
            for (int j = 1; j <= row-i ; j++) {                // To create spaces
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {               // To print the number in forward order
                System.out.print(k);
            }
            for (int l = i-1; l >=1 ; l--) {             // to print the reverse order
                System.out.print(l);
            }
            System.out.println();
        }
    }
}