package Threads ;
class t1 extends Thread 
{
    public void run(){
        for (int i = 1; i <= 100 ; i++) {
            System.out.println("hi");
        }
    }
}
class t2 extends Thread 
{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");   
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {
        t1 foo = new t1();
        t2 fo = new t2();
        foo.start(); 
        fo.start();
    }
}