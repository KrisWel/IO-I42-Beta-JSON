package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.transformer.logic.JSONTransformer;
import pl.put.poznan.transformer.utils.OnlySpecificValues;

import java.util.ArrayList;

/**
 * <p>
 *
 * Klasa REST sluzaca do poslugiwania sie klasa do utworzenia uproszczonej
 * struktury JSON przez podanie odpowiedniego klucza. Dodatkowo jest uzyta biblioteka
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
@RequestMapping("/specific")
public class OnlySpecificValuesController {

    private static final Logger logger = LoggerFactory.getLogger(JSONTransformer.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> get(String text) {
        //pass
        logger.error("No GET method yet in onlySpecificValues");
        return ResponseEntity.ok().build();

    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> post(@RequestBody OnlySpecificValues temp) {
        System.out.println(temp.getJson());
        System.out.println(temp.getKeys());
        JSONTransformer converter = new JSONTransformer();
        String output = converter.getSpecificValues(temp);
        logger.info("Extraction successfull");
        logger.debug("Extracted JSON: {}", output);

        return ResponseEntity.ok(output);
    }


}
