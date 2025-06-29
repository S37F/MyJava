import java.util.*;
class Trees {
    Scanner sc = new Scanner(System.in);
    int tc ;
    double th ;
    double tb ;
    double ts ;
    Trees(int tc , double th , double tb , double ts ){
        this.tc=tc ;
        this.th=th ;
        this.tb=tb;
        this.ts=ts ;
    }
    void update(){
        System.out.println("Update tree code , height , base , amount spent :");
        tc = sc.nextInt();
        th = sc.nextDouble();
        tb = sc.nextDouble();
        ts = sc.nextDouble();
    }
    void display(){
        System.out.println("Tree code :"+tc);
        System.out.println("Tree height is :"+th);
        System.out.println("Tree base is :"+tb);
        System.out.println("Tree  Amount Spent is :"+ts);
    }
}
class Mango  extends Trees{
    int ty ;
    Mango(int tc , double th , double tb , double  ts,int ty){
        super(tc , th , tb , ts );
        this.ty=ty ;
    }
    void update(){
        System.out.println("Update Yeild :"+ty);
        ty = sc.nextInt();
    }
    void display(){
        System.out.println("Tree code :"+tc);
        System.out.println("Tree height :"+th);
        System.out.println("Tree base :"+tb);
        System.out.println("Amount spent on tree :"+ts);
        System.out.println("Yield :"+ty);
    }
}
public class Garden {
    public static void main(String[] args) {
        Mango fm = new Mango(14, 22, 822.14, 0484.44, 7779);
        fm.display();
        fm.update();
        fm.display();
    }
    
}
