package Abstraction;

public class MediaMain {
    public static void main(String[] args) {
    VideoPlayer videoPlayer = new VideoPlayer("Youtube","One Love",215);
    AudioPlayer audioPlayer = new AudioPlayer("Spotify","Pehle bhi main","Vishal Mishra");
    ImageDisplay imageDisplay = new ImageDisplay("Photoshop","Demo Image","1920X1080");

        audioPlayer.play();
        audioPlayer.displayDetails();

        System.out.println("-----------------------------------------------------------------");

        videoPlayer.play();
        videoPlayer.displayDetails();

        System.out.println("-----------------------------------------------------------------");

        imageDisplay.play();
        imageDisplay.displayDetails();
    }
}
