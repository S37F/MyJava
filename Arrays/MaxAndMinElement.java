package Arrays;
import java.util.Scanner;
public class MaxAndMinElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n ;
        System.out.print("Enter the size of an array :");
        n = sc.nextInt();
        System.out.print("Enter the "+n+" elements of an array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(+arr[i]+" ");
        }
        int max = arr[0] ;
        int min = arr[0] ;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("The Maximum Value is :"+max);
        System.out.println("The minimus value is :"+min);
    }
}
