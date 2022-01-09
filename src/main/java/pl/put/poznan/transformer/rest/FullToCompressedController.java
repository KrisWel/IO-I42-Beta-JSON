package pl.put.poznan.transformer.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.JSONTransformer;

/**
 * <p>
 *
 * Klasa REST sluzaca do poslugiwania sie klasa do utworzenia zminifikowanej
 * struktury JSON z pelnej. Dodatkowo jest uzyta biblioteka
 * sl4j, ktora informuje w konsoli o bledach i powodzeniach funkcjonalnosci.
 *
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 */

@RestController
@RequestMapping("/minify")
public class FullToCompressedController {

    private static final Logger logger = LoggerFactory.getLogger(JSONTransformer.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> get(String text) {
        //pass
        logger.error("No GET method yet in minify");
        return ResponseEntity.ok().build();

    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> post(@RequestBody String text) {

        JSONTransformer converter = new JSONTransformer();
        String output = converter.compress(text);
        logger.info("Minification succesfull");
        logger.debug("Minified JSON: {}", output);
        return ResponseEntity.ok(output);
    }



}


