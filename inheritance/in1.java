import java.util.*;
class Vehicle {
    String name ;
    String model ;
    double price ;
    Scanner sc = new Scanner(System.in);
    public Vehicle(String name , String model , double price){
        this.name = name ;
        this.model = model ;
        this.price = price ;
    }
}
    class Car extends Vehicle {
        public Car(String name , String  model , double price) {
            super(name, model, price);
        }
        void  showCarDetails() {
            System.out.println("The car  is " + name +" and it's model is "+ model + " and the price of the car is RM"+ price );
            System.out.println("Name of  the car : " + name );
            System.out.println("Model of  the car : " + model ) ;
            System.out.println("Price of the car is : $" + price ) ;
        }
    }
public class in1 {
    public static void main(String[] args) {
        Car myCar = new Car("Supra","GTR",99999);
        myCar.showCarDetails();
    }
}
