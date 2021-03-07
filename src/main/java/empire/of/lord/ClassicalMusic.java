package empire.of.lord;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

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
