package TT1;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
class Book {
    String name;
    String author;
    double price;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book ");
        name = sc.nextLine();
        System.out.println("name of author :");
        author = sc.nextLine();
        System.out.println("Price of book :");
        price = sc.nextInt();
    }
    void display(){
        System.out.println("The name of the book is :"+name);
        System.out.println("Author name :"+author);
        System.out.println("Price of the book :"+price);
    }
}
public class prc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b =new Book();
        b.getdata();
        b.display();
    }
}
