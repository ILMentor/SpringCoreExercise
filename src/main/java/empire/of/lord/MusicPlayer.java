package empire.of.lord;

public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    public void playMusic(){
        classicalMusic = new ClassicalMusic();
        classicalMusic.getSong();
    }
}
