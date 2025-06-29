package ExceptionHandling;
import java.util.*;
public class MultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a ;
        int b ;
        String str = null ;
        int arr[] = {10,22,53,74,65,};
        int ans = 0 ;
        System.out.println("Enter the number a :");
        a = sc.nextInt();
        System.out.println("Enter the number b :");
        b = sc.nextInt();
        try {
            ans = a/b ;
            System.out.println(arr[4]);
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("The number is divided my zero "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index of array is from 0 to 4 .... "+e);
        }
        catch(NullPointerException e){
            System.out.println("You have to enter the wrong string "+e);
        }
        catch(Exception e){
            System.out.println("Somthing wents wrong ...");
        }
        System.out.println("The ans is : "+ans);
    }
}
