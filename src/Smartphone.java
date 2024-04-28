public class Smartphone  implements Calc,Camera,Computer,MusicPlayer{
    @Override
    public void calculate() {
        System.out.println("Smartphone can do basic calculations");
    }

    @Override
    public void takePhotos() {
        System.out.println("Smartphone can take photos");

    }

    @Override
    public void doComplexCalculations() {
        System.out.println("Smartphone can do complex calculations");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone can play music");
    }

    void os(){
        System.out.println("Smartphone can have any OS");
    }
}
