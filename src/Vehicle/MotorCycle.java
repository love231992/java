package Vehicle;

public class MotorCycle extends Vehicle {
    int numOfCylinder;

    public MotorCycle(String make, String model, int year,int numOfCylinder) {
        super(make, model, year);
    }

    void maxSpeed(){
        System.out.println("Bike max speed is 120 KMPH");
    }
    void canGoInNarrowSpaces(){
        System.out.println("Bike can go in narrow spaces");
    }

}
