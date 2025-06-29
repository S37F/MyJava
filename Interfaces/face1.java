package Interfaces;
interface In1 {
    final int a  = 10 ;
    void display();
}
class TestClass implements In1 {
    public void display(){
        System.out.println("Fahim");
    }
}
public class face1 {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }    
}
