package Abstraction;

public abstract class MediaDevice {
    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    abstract void displayDetails();
    abstract void play();


}
