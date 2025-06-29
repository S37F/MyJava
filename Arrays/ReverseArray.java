package Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        System.out.print("Enter the size of an array :");
        n = sc.nextInt();
        System.out.println("Enter the " + n + " Element of an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Reverse arrays is :");
        for (int i = n-1;i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
