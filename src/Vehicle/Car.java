package Vehicle;

public class Car extends Vehicle{
    int numOfDoors;

    public Car(String make, String model, int year, int numOfDoors) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }

    void haveAC (){
        System.out.println("Car can have AC option");
    }
    void playMusic (){
        System.out.println("Car can play music");
    }
    void maxSpeed(){
        System.out.println("car max speed is 200 KMPH");
    }
}
