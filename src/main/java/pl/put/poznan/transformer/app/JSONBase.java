package pl.put.poznan.transformer.app;

/**
 * <p>
 * Prosty interfejs do przechowywania i sprawdzania poprawnosci
 * struktury JSON
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

public interface JSONBase {

    /**
     *
     * @param test - String ze struktura JSON
     * @return bool czy jest to poprawna struktura
     */
    boolean isJSONValid(String test);

    /**
     *
     * @return zwraca strukture json
     */
    String getJSON();
}
