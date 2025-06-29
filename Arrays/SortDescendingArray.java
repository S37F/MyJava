package Arrays;
import java.util.Scanner;
public class SortDescendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100] ;
        int n ;
        System.out.println("Enter the size of an array :");
        n = sc.nextInt();
        System.out.println("Enter the "+n+" Number of elements in an array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Unsorted array is :");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }
        // sorting array in ascending order
        for (int i = 0; i < n; i++) {                        // this loops checks the first elements
            for (int j = i+1; j < n ; j++) {                // this loop checks the last element
                if (arr[i]<arr[j]){                        // Start checking elements
                    int temp = arr[i];                // Swapping
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
        System.out.println();
        System.out.println("The Sort Array in Descending order is :");
        for (int i = 0; i < n; i++) {                   // Printing the resultant elements
            System.out.print(arr[i]+" ");
        }
    }
}
