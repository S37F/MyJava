package Arrays;
import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100] ;
        int n , count = 0;
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" elements in an array :");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is :");
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]){
                    count = arr[j];
                }
            }
        }
        System.out.println("The duplicate element is : "+count);
    }
}
