package BasicsOfJava;

public class Calcsimpleinterest {
    public static void main(String[] args) {
        double p = 100 , r = 10 , t = 2 ;
        double si = (p * r * t)/100 ;
        System.out.println("The Price is : "+p);
        System.out.println("The Rate is :"+r);
        System.out.println("The time period is :"+t);
        System.out.println("The simple interest of given data :" + si);
    }
}
