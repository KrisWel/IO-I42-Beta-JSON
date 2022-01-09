package pl.put.poznan.transformer.app;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import com.google.gson.*;

/**
 * Jako programista moge uzyskac pelna strukture w formacie JSON ze zminifikowanego zapisu w formacie JSON, aby polepszyc czytelnosc danych
 * <p>
 * Program pobiera lancuch znakow w formacie zgodnym z JSON z naszej klasy glownej
 *  i dzieki bibliotece gson i klasy GsonBuilder
 * jestesmy w stanie odtworzyc zminifikowana strukture JSON do przyjrzystej
 * i czytelnej dla czlowieka struktury.
 *
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 */

public class CompressedToFullJSON extends JSONBaseDecorator {

    /**
     * @param compressed - String ze struktura JSON
     */
    public CompressedToFullJSON(String compressed) {
        super(compressed);
    }

    /**
     *
     * @return - String z JSON
     */
    public String uncompression() {
        try {
            JSONObject jsonDoc = (JSONObject) JSONValue.parse(super.getJSON());
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement je = JsonParser.parseString(String.valueOf(jsonDoc));

            return gson.toJson(je);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Invalid JSON!";
    }
}
