public class YouTubePremium extends YouTube implements AudioPlayer,VideoPlayer{
    @Override
    public void canPlayScreenOff() {
        System.out.println("Can play with screen off");
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void canHaveChats() {
        super.canHaveChats();
    }
}
