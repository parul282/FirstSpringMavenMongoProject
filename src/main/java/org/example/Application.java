package org.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "org.example")
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).build().run(args);
    }
}
