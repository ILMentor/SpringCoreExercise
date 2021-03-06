package empire.of.lord;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        firstMusicPlayer.playMusic();

        boolean comparison = firstMusicPlayer == secondMusicPlayer; // сравнивает, указывают ли объекты на один и тот
        // же участок памяти

        System.out.println(comparison);
        System.out.println(firstMusicPlayer); // использование метода toString() по-умолчанию, т.к. он не прописан в классе
        System.out.println(secondMusicPlayer);

        context.close();
    }
}
