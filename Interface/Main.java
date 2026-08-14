interface Vehicle {
    void start();
    void stop();
    void changeGear(int gear);
    void accelerate(int speed);
    void brake(int speed);

}
class Car implements Vehicle {
    private int gear;
    private int speed;

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car changed to gear " + gear);
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Car accelerated to " + this.speed + " km/h");
    }

    public void brake(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Car slowed down to " + this.speed + " km/h");
    }

}
class Bike implements Vehicle {
    private int gear;
    private int speed;

    public void start() {
        System.out.println("Bike started.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Bike changed to gear " + gear);
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Bike accelerated to " + this.speed + " km/h");
    }

    public void brake(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Bike slowed down to " + this.speed + " km/h");
    }

}
class Truck implements Vehicle {
    private int gear;
    private int speed;

    public void start() {
        System.out.println("Truck started.");
    }

    public void stop() {
        System.out.println("Truck stopped.");
    }

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Truck changed to gear " + gear);
    }

    public void accelerate(int speed) {
        this.speed += speed;
        System.out.println("Truck accelerated to " + this.speed + " km/h");
    }

    public void brake(int speed) {
        this.speed -= speed;
        if (this.speed < 0) {
            this.speed = 0;
        }
        System.out.println("Truck slowed down to " + this.speed + " km/h");
    }

}
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.changeGear(2);
        car.accelerate(50);
        car.brake(20);
        car.stop();

        System.out.println();

        Vehicle bike = new Bike();
        bike.start();
        bike.changeGear(3);
        bike.accelerate(30);
        bike.brake(10);
        bike.stop();

        System.out.println();

        Vehicle truck = new Truck();
        truck.start();
        truck.changeGear(1);
        truck.accelerate(40);
        truck.brake(15);
        truck.stop();
    }
}