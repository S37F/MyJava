package Arrays;
import java.util.Scanner;
public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100] ;
        int count = 0 ;
        int n , x ;
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
        System.out.println("Enter the number that you want to find :");
        x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println("The Occurrence of "+x+" is :"+count+" times");
    }
}
