package empire.of.lord;

public class MusicPlayer {
    private Music music;

    public void playMusic(){
        music = new ClassicalMusic();
        music.getSong();
    }
}
