class Anmial {
    String sound(){
        return "Animal makes a sound ";
    }
}
class Goat extends Anmial{
    @Override
    String sound(){
        return "MEH MEH MEH ";
    }
}
public class in2 {
    public static void main(String[] args) {
        Goat myobj = new Goat();
        System.out.println(myobj.sound());        
    }    
}
