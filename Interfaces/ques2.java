package Interfaces;
interface Calc {
    double pi = 3.14 ;
    public double compute(double x , double y);
}
class Rect implements Calc {
    public double compute(double x , double y){
        return x*y ;
    }
}
class Tri implements Calc {
    public double compute(double x , double y){
        return x*y/2 ;
    }
}
class Circle implements Calc {
    public double compute(double x , double y){
        return pi*x*x ;
    }
}
class ques2 {
    public static void main(String[] args) {
        Rect foo = new Rect();
        Tri fo = new  Tri();
        Circle f = new Circle();
        System.out.println("The area of rectangle is :"+foo.compute(10,20));
        System.out.println("The area of triangle is :"+fo.compute(10, 12));
        System.out.println("The area of circle is :"+f.compute(10,12));          
    }
}
