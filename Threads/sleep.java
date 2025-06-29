package Threads;
class A extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi !");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("HELLO !");
            try {
                Thread.sleep(10);
            }
             catch (Exception e) {
                e.printStackTrace();
            }
        }    
    }
}
public class sleep {
    public static void main(String[] args) {
        A foo = new A();
        B fo = new B();
        foo.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fo.start();
    }
    
}
