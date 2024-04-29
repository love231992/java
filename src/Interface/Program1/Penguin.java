package Interface.Program1;

public class Penguin implements Animal,SwimableAnimal {
    @Override
    public void feed() {
        System.out.println("Penguin is being fed.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin makes sound.");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming.");
    }
}
