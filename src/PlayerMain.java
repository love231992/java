@FunctionalInterface
interface Vehicle {
    void run();
//    void tyre();
}

public class PlayerMain {
    public static void main(String[] args) {
//        YouTube yt = new YouTube();
//        YouTubePremium ytp = new YouTubePremium();
//        yt.canHaveChats();
//        yt.canPlayScreenOff();
//        yt.pause();
//        ytp.canHaveChats();
//        ytp.canPlayScreenOff();

        Smartphone smartphone = new Smartphone();
        Iphone iphone = new Iphone();
        smartphone.os();
        iphone.os();
    }
}
