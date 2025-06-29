/*
import java.util.Scanner;
public class RoughWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.println("Enter a :");
        a = sc.nextInt();
        System.out.println("Enter b :");
        b = sc.nextInt();

    System.out.print("The addition: "+(a+b));
    }
}*/

/*
import java.util.Scanner;
public class RoughWork{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        int f = 1 ;
        System.out.print("Enter the number :");
        n = sc.nextInt();
        do{
            f = f * n ;
            n = n - 1 ;
        }while(n>0);
        System.out.print("The Fcatorial :"+f);
    }
}*/

/*
import java.util.Scanner;
public class RoughWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3, s4, s5;
        double per;
        System.out.println("Enter the marks of subject 1 :");
        s1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2 :");
        s2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3 :");
        s3 = sc.nextInt();
        System.out.println("Enter the marks of subject 4 :");
        s4 = sc.nextInt();
        System.out.println("Enter the marks of subject 5 :");
        s5 = sc.nextInt();

        per = (s1 + s2 + s3 + s4 + s5) / 5;

        System.out.println("The percentage is =" + per);

        if (per >= 90) {
            System.out.println("Grade : Excellent !");
        }
        else if (per >= 80) {
            System.out.println("Grade : Very Good !");
        } else if (per >= 70) {
            System.out.println("Grade : Good !");
        } else if (per >= 60) {
            System.out.println("Grade : Average !");
        }
        else if (per >= 50) {
            System.out.println("Grade : Can Do Better !");
        }
        else if (per >= 40) {
            System.out.println("Grade : Fail !");
        }
    }
}*/

/*
import java.util.*;                       // Matrix multiplication ...
class RoughWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[100][100];
        int b[][] = new int[100][100];
        int r1 , c1 , r2 , c2 ;
        System.out.println("Enter the number of rows of first matrix  :");
        r1 = sc.nextInt();
        System.out.println("Enter the number of column of first matrix :");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows of second matrix  :");
        r2 = sc.nextInt();
        System.out.println("Enter the number of column of second matrix :");
        c2 = sc.nextInt();
        System.out.println("Enter the elements of first matrix :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the elements of second matrix :");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0 ;
        int pro[][] = new int[100][100] ;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                    sum = sum + a[i][k] * b[k][j] ;
                }
                pro[i][j] = sum ;
            }
        }
        System.out.println("The multiplication matrix is :");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(pro[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/

/*import java.util.*;
class RoughWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        for(int i =0 ; i<arr.length ; i++){
            arr[i] = new int[i+1];
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = j+1 ;
            }
        }
        for (int i  = 0; i <arr.length ; i++) {
            for (int j = 0; j<arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/

/*import java.util.Scanner;
class RoughWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = new String();
        str = sc.nextLine();
        System.out.println("Enter the character to count :");
        char ch = sc.next().charAt(0);
        int f = 0 ;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                f++;
            }
        }
        System.out.println("the frequency is :"+f);

    }
}*/
