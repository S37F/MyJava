class Vehicleee {
    Vehicleee(){
        System.out.println("This is vehicle class");
    }
}
class Bus extends Vehicleee{
    Bus(){
        System.out.println("This is bus class ");
    }
}
class Truck extends Bus{
    Truck(){
        System.out.println("This is truck class ");
    }
}
public class Transport {
    public static void main(String[] args) {
        new Truck();
    }
}
