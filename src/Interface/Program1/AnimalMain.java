package Interface.Program1;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Animal penguin = new Penguin();
        Monkey monkey = new Monkey();

        System.out.println("=== Lion Behaviors ===");
        lion.feed();
        lion.makeSound();
        lion.climb();

        System.out.println("\n=== Penguin Behaviors ===");
        penguin.feed();
        penguin.makeSound();
        if (penguin instanceof ClimableAnimal) {
            ((ClimableAnimal) penguin).climb();
        } else ((SwimableAnimal) penguin).swim();

        System.out.println("\n=== Monkey Behaviors ===");
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
    }

}
