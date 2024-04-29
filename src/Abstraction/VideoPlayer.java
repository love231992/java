package Abstraction;

public class VideoPlayer extends MediaDevice {

    String videoTitle;
    int duration;

    public VideoPlayer(String name, String videoTitle, int duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("Video Player Name: " + name);
        System.out.println("Video Title: " + videoTitle);
        System.out.println("Duration: " + duration + " seconds");
    }

    @Override
    void play() {
        System.out.println("Playing video: " + videoTitle + ", Duration: " + duration + " seconds");
    }
}
