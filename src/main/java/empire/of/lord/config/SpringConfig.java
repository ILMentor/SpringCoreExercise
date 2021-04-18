package empire.of.lord.config;

import empire.of.lord.music.ClassicalMusic;
import empire.of.lord.device.Computer;
import empire.of.lord.device.MusicPlayer;
import empire.of.lord.music.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(), rockMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
