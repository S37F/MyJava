class Parent {
    void Parent(){
        System.out.println("This is parent class ");
    }
}
class Child1 extends Parent{
    void child1(){
        System.out.println("I am child 1");
    }
}
class Child2 extends Child1 {
    void Child2(){
        System.out.println("I am child 2");
    }
}
public class in4 {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.Parent();
        obj.child1();
        obj.Child2();
    }
}
