package pl.put.poznan.transformer.app;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Jako programista moge uzyskac strukture w formacie JSON zawierajacc tylko okreslone wlasnosci, aby uproscic strukture
 * <p>
 *
 * Program pobiera strukture JSON oraz liste kluczy, ktore sa parametrami do znalezienia
 * i wyswietlenia specyficznych wlasnosci. Klasa uzywa interfejsu HashSet aby ulatwic porownywanie
 * ciagow znakow. Nastepnie funkcja usuwa rzeczy, ktore nie zostaly wybrane przez
 * uzytkownika
 *
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 */

public class JSONOnlySpecificValues extends JSONBaseDecorator {

    /**
     * @param json - String ze struktura JSON
     */
    public JSONOnlySpecificValues(String json) {
        super(json);
    }

    /**
     *
     * @param keys - lista wyznaczonych parametrow
     * @return - String z JSON
     */
    public String specify(ArrayList<String> keys) {
        try {
            JSONObject jsonDoc = (JSONObject) JSONValue.parse(super.getJSON());

            Set<String> specified = new HashSet<String>(keys);
            Set<String> jsonKeys = new HashSet<String>(jsonDoc.keySet());

            for( String key : jsonKeys) {
                if (!specified.contains(key)) {
                    jsonDoc.remove(key);
                }
            }
            //System.out.println("Zmieniono strukture");
            return jsonDoc.toJSONString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Invalid Json!";
    }
}