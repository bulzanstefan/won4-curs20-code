package ro.fasttracklit.curs20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttracklit.curs20.config.FasttrackitCursConfig;

import java.util.Arrays;

@SpringBootApplication
public class Curs20CodeApplication {
    private static final Logger log = LoggerFactory.getLogger(Curs20CodeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Curs20CodeApplication.class, args);
    }

    @Bean
    CommandLineRunner atStartup(FasttrackitCursConfig config) {
        return args -> {
            log.info("args {}", Arrays.asList(args));
            log.info("The config is {}", config.getNumber());
            log.info("The topic is {}", config.getTopic());
        };
    }
}
