package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class JSONTransformerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JSONTransformerApplication.class, args);
    }
}
