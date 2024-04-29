package Vehicle;

public class ElectricCar extends Car{
    String batteryCapacity;

    public ElectricCar(String make, String model, int year, int numOfDoors,String batteryCapacity) {
        super(make, model, year, numOfDoors);
    }

    void chargeBattery(){
        System.out.println("Electric car battery will take 5-6 hrs to charge fully.");
    }
}
