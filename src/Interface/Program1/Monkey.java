package Interface.Program1;

class Monkey implements Animal, ClimableAnimal {
    @Override
    public void feed() {
        System.out.println("Monkey is being fed.");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey makes a chattering sound.");
    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing.");
    }
}