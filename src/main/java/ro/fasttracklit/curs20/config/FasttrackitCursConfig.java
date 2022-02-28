package ro.fasttracklit.curs20.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "fasttrackit.curs")
public class FasttrackitCursConfig {
    private int number;
    private String topic;

    public String getTopic() {
        return topic;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
