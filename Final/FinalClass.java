package Final;
final class A{
    public final void a(){
        System.out.println("Here , we cannot extend classes ");
    }
}
public class FinalClass {
    public static void main(String[] args) {
       A foo = new A();
       foo.a();
    }
}
