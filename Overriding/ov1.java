package Overriding;
class bank {
    void info(){
        System.out.println("This is method of parent class");
    }
}
class Sbi extends bank {
    void info(){
        System.out.println("This is method of sbi class");
    }
}
class icici extends Sbi {
    void info(){
        System.out.println("This is method of icici class");
    }
}
public class ov1 {
    public static void main(String[] args) {
       icici foo = new icici();
       foo.info();
       Sbi fo = new Sbi(); 
       fo.info();
       bank f = new bank();
       f.info();
    }
}


// Method overiding mean we can use a single method in differnet
// classes but when we calls them we have to make the object of each classes .

