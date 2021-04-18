package empire.of.lord.music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }

    @Override
    public String getSong() {
        return "Rhapsody";
    }
}
