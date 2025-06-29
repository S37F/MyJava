class Calculator {
    int add(int a, int b){
        return a + b ;
    }
    int add(int a , int b , int c){
        return a + b + c ;
    }
}
class Scal extends Calculator{
    @Override 
    int add(int a,int b){
        return a + b + 10 ;
    }
}
public class in3 {
    public static void main(String[] args) {
        Scal myScal = new Scal();
        System.out.println(myScal.add(5, 7));
        System.out.println(myScal.add(7, 6, 8));
    }
}
