package pl.put.poznan.transformer.app;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


/*
 * <p>
 * Głowna klasa przechowująca wybraną przez nas strukturę JSON. Służy do zaimplementowania
 * wzorca projektowego 'dekorator'.
 *
 * <p>
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.2
 * @since 1.0
 *
 *
 */

public class JSONBase {

    /*
     * @param json - przechowuje strukturę JSON do odczytu
     */
    private String json;

    /*
     * Podstawowe wczytanie pliku do zmiennej
     */
    public JSONBase(String text) {
        if(isJSONValid(text)){
            try {
                json = text;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * Sprawdza czy wejściowa stuktura JSON jest poprawna
     */
    public boolean isJSONValid(String test) {
        try {
            JSONObject testJson = (JSONObject) JSONValue.parse(test);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public String getJSON() {
        return json;
    }

}
