package cm.org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeltaSparkApp {

    public static void main(String[] args) {
        SpringApplication springBootApplication = new SpringApplication(DeltaSparkApp.class);

        springBootApplication.run(args);
    }

}
