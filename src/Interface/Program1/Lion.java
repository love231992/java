package Interface.Program1;

public class Lion implements Animal,ClimableAnimal{
    @Override
    public void feed() {
        System.out.println("Lion is being fed.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Roars!");
    }

    @Override
    public void climb() {
        System.out.println("Lion is climbing.");

    }
}
