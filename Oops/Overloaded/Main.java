package Oops.Overloaded;
class Car{
    void display(){
         System.out.println("This is a basic car");
    }
}
class BMW extends Car{
    void display(String model, String top_speed, String  mileage){
         System.out.println("This model of BMW is " + model + ". It's top speed is  " + top_speed + ". And it has a mileage of " + mileage);
    }

}
public class Main {
    
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
        BMW bmw = new BMW();
        bmw.display("BMW i5", "135 mph", "350 mpg" );
        }
}
