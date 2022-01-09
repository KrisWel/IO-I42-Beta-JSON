package pl.put.poznan.transformer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Glowna funkcja Main odpalajaca aplikacje
 * <p>
 *
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 */

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.transformer.rest"})
public class JSONTransformerApplication {

    /**
     *
     * @param args - argumenty glownej funkcji
     */
    public static void main(String[] args) {
        SpringApplication.run(JSONTransformerApplication.class, args);
    }
}
