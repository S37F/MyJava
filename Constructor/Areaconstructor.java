package Constructor;
import java.util.Scanner;
class Areaconstructor {
    Scanner sc = new Scanner(System.in);
    class areaofsquare{
        areaofsquare(int a) {
            System.out.println("Enter the side of a square :");
            a = sc.nextInt();
            int c = a * a;
            System.out.println(c);
        }
    }
    class areaofrect{
        areaofrect(int a , int b){
            System.out.println("Enter the l and b :");
            a = sc.nextInt();
            b = sc.nextInt();
            int c = a * b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Areaconstructor ar = new Areaconstructor();
    }
}
