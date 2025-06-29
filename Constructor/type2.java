package Constructor;
class Parameterizedcon{
    String name ;
    int id ;
    Parameterizedcon(String name , int id){
        this.name = name ;
        this.id = id ;
    }
}
public class type2 {
    public static void main(String[] args) {
        //creating object of the parameterized constructor
        Parameterizedcon obj1 = new Parameterizedcon( "Fahim" , 052);
        System.out.println("Name : "+obj1.name + "\nID : "+obj1.id );        
    }
}
