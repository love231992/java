package Abstraction;

public class ImageDisplay extends MediaDevice {
    String imageName;
    String resolution;

    public ImageDisplay(String name, String imageName, String resolution) {
        super(name);
        this.imageName = imageName;
        this.resolution = resolution;
    }

    @Override
    void displayDetails() {
        System.out.println("Image Viewer name: " + name);
        System.out.println("Image Name: " + imageName);
        System.out.println("Resolution: " + resolution);
    }

    @Override
    void play() {
        System.out.println("Displaying image: " + imageName + ", Resolution: " + resolution);
    }
}
