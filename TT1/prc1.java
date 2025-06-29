package TT1;
import java.util.Scanner;
public class prc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[100];
        int n ;
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        System.out.println("Enter the element of array 1:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest number is :"+max);
    }
}
