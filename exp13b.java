class fahim extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("/");
        }
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class badgujar extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("*");
        }
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class exp13b {
    public static void main(String[] args) {
        fahim foo = new fahim();
        badgujar fo = new badgujar();
        foo.start();
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fo.start();
    }
}