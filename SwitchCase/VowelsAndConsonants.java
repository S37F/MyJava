package SwitchCase;
import java.util.Scanner;
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ;
        System.out.print("Enter Any alphabets :");
        ch = sc.next().charAt(0);
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowels!");
            default:
                System.out.println("Consonants!");
        }
    }
}
