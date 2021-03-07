package empire.of.lord;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        context.close();
    }
}
