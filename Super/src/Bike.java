public class Bike extends Vehicle {
    int speed = 100;

    public Bike() {
        super();
        System.out.println("Bike is created");
    }

    void display() {
        System.out.println(super.speed);
    }

    void displayMsg() {
        super.sayHello();
    }
}
