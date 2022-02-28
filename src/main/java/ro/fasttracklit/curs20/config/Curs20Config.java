package ro.fasttracklit.curs20.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Curs20Config {
    private static final Logger log = LoggerFactory.getLogger(Curs20Config.class);
    private final String applicationName;

    public Curs20Config(
            @Value("${spring.application.name}") String applicationName,
            @Value("${fasttrackit.curs.topic}") String topic) {
        log.info("My application is called {}", applicationName);
        this.applicationName = applicationName;
        log.info("The topic is {}", topic);
    }

    public String getApplicationName() {
        return applicationName;
    }
}
