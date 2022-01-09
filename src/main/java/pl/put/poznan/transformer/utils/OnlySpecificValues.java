package pl.put.poznan.transformer.utils;

import java.util.ArrayList;

/**
 *
 * <p>
 *
 * Klasa przechowywujaca wartosci z klasy wyznaczajacej wybrane parametry.
 * Wypisuje tez odpowiednie dane do konsoli.
 *
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 */

public class OnlySpecificValues {

    /**
     *
     * text - String ze struktura JSON
     * keys - lista wyznaczonych parametrow
     */
    private final String text;
    ArrayList<String> keys;

    /**
     *
     * @param text - String ze struktura JSON
     * @param keys - lista wyznaczonych parametrow
     */
    public OnlySpecificValues(String text, ArrayList<String> keys){
        System.out.println(text);
        this.text = text;
        this.keys = keys;
    }

    /**
     *
     * @return - String z JSON
     */
    public String getJson() {
        return text;
    }

    /**
     *
     * @return - lista z kluczami wybranych parametrow
     */
    public ArrayList<String> getKeys() {
        return keys;
    }
}
