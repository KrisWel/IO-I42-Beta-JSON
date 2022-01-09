package pl.put.poznan.transformer.app;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


/**
 * <p>
 * Glowna klasa przechowujaca wybrana przez nas strukture JSON. Sluzy do zaimplementowania
 * wzorca projektowego 'dekorator'.
 *
 * <p>
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 *
 *
 */

public class JSONBaseDecorator implements JSONBase {

    /**
     * Agregacja glownej klasy przechowujacej strukture JSON.
     */
    private String json;

    /**
     *
     * @param text - String ze struktura JSON
     */
    public JSONBaseDecorator(String text) {
        if(isJSONValid(text)){
            try {
                json = text;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param test - String ze struktura JSON
     * @return bool czy jest to poprawna struktura
     */
    public boolean isJSONValid(String test) {
        try {
            JSONObject testJson = (JSONObject) JSONValue.parse(test);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return zwraca strukture json
     */
    public String getJSON() {
        return json;
    }

}
