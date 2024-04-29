package Vehicle;

public class Vehicle {
    String make;
    String model;
    int year;

    void start(){
        System.out.println("Vehicle is started");
    }
    void stop (){
        System.out.println("Vehicle is stopped");
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo(){
        System.out.println("The vehicle is made by "+ make);
        System.out.println("The vehicle model is "+ model);
        System.out.println("The vehicle is manufactured in "+ year);
    }


}
