package empire.of.lord;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        firstMusicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer);
        context.close();
    }
}
