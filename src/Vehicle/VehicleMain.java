package Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("hyundai","Elentra",2034,4);
        car.haveAC();
        car.maxSpeed();
        car.playMusic();
        car.displayInfo();
        System.out.println("-------------------------------------------------------------------------");
        MotorCycle bike = new MotorCycle("Royal Enfield","Himalayan",2022,4);
        bike.maxSpeed();
        bike.displayInfo();
        bike.canGoInNarrowSpaces();
        System.out.println("-------------------------------------------------------------------------");
        ElectricCar ecar = new ElectricCar("Tesla","Model S",2024,4,"113.2 kWh");
        ecar.displayInfo();
        ecar.chargeBattery();
    }
}
