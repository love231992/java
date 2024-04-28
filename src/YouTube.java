public class YouTube implements AudioPlayer,VideoPlayer{
    @Override
    public void canPlayScreenOff() {
        System.out.println("Can't Play with screen off");
    }

    @Override
    public void play() {
        System.out.println("Can play music");
    }

    @Override
    public void pause() {
        System.out.println("Can pause music");
    }

    @Override
    public void resume() {
        System.out.println("Can resume music");
    }

    @Override
    public void stop() {
        System.out.println("Can stop music");
    }

    @Override
    public void canHaveChats() {
        System.out.println("Can have chats while playing music");
    }
}
