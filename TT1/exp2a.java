package TT1;
import java.util.Scanner;
public class exp2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[100];
        int n ;
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        int sum = 0 ;
        int []sumarray = new int[100];
        for (int i = 0; i < n; i++) {
            sumarray[i] = sum - arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sumarray[i]+" ");
        }
    }
}
