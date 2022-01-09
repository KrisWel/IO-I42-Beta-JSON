package pl.put.poznan.transformer.logic;

import pl.put.poznan.transformer.app.CompressedToFullJSON;
import pl.put.poznan.transformer.app.FullToCompressedJSON;
import pl.put.poznan.transformer.app.JSONBaseDecorator;
import pl.put.poznan.transformer.app.JSONOnlySpecificValues;
import pl.put.poznan.transformer.utils.OnlySpecificValues;

import java.util.ArrayList;

/**
 * <p>
 *
 * Klasa pobierajaca opatentowane funkcje.
 *
 * @author 144493 (Scrum Master)
 * @author 145299 (Proxy Product Owner)
 * @author 144629
 * @author 145357
 * @version 1.0.5
 * @since 1.0
 */

public class JSONTransformer {

    /**
     *
     * @param text - String ze struktura JSON
     * @return - String z JSON
     */
    public String compress(String text){
        JSONBaseDecorator uncompressed = new FullToCompressedJSON(text);
        return ((FullToCompressedJSON) uncompressed).compression();
    }

    /**
     *
     * @param text - String ze struktura JSON
     * @return - String z JSON
     */
    public String uncompress(String text){
        JSONBaseDecorator compressed = new CompressedToFullJSON(text);
        return ((CompressedToFullJSON) compressed).uncompression();
    }

    /**
     *
     * @param wrapped - obiekt przechowywujacy opdowiednie wartosci JSON do
     *                wypisania wybranych parametrow
     * @return - String z JSON
     */
    public String getSpecificValues(OnlySpecificValues wrapped){
        JSONBaseDecorator jsonOnlySpecificValues = new JSONOnlySpecificValues(wrapped.getJson());
        return ((JSONOnlySpecificValues) jsonOnlySpecificValues).specify(wrapped.getKeys());

    }
}

