class table5 extends Thread{
    public void run(){
        int n1 = 5 ;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n1*i);
        }
    }
}
class table7 extends Thread{
    public void run(){
        int n2 = 7 ;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n2*i);
        }
    }
}
class table13 extends Thread{
    public void run(){
        int n3 = 13 ;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n3*i);
        }
    }
}
public class exp13a {
    public static void main(String[] args) {
        table5 foo = new table5();
        table7 fo = new table7();
        table13 f = new table13();
        foo.start();
        fo.start();
        f.start();
    }
}
