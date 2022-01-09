package pl.put.poznan.transformer.app;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


/**
 * Jako programista moge uzyskac zminifikowana strukture w formacie JSON na podstawie pełnego zapisu w formacie JSON, aby zmniejszyc rozmiar danych.
 * <p>
 * Program pobiera lancuch znakow w formacie zgodnym z JSON z naszej klasy glownej
 *  i dzieki funkcji JSONValue.parse usuwa wszelkie
 * biale znaki z pliku. Dzieki temu jestesmy w stanie otrzymac strukture nawet o polowe
 * lzejsza niz oryginal.
 *
 * <p>
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 *
 */

public class FullToCompressedJSON extends JSONBaseDecorator {

    /**
     * @param uncompressed - String ze struktura JSON
     */
    public FullToCompressedJSON(String uncompressed) {
        super(uncompressed);
    }

    /**
     *
     * @return - String z JSON
     */
    public String compression() {
        try {
            JSONObject jsonDoc = (JSONObject) JSONValue.parse(super.getJSON());
            System.out.println("JSON compressed");

            return jsonDoc.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Invalid JSON!";
    }



}
