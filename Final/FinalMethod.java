package Final;
class FinalDemo {
    public final void display(){
        System.out.println("This is final method ");
    }
}
class Main extends FinalDemo {
    public final void show(){
        System.out.println("This is second final method ");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Main foo = new Main();
        foo.display();
        foo.show();
        System.out.println("Note : We cannot override the final method !");
    }
}
