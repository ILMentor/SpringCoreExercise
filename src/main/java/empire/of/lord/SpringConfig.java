package empire.of.lord;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("empire.of.lord")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
