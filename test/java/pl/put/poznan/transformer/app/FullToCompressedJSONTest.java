package pl.put.poznan.transformer.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullToCompressedJSONTest {

    JSONBaseDecorator fullJSON;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compression1() {
        fullJSON = new FullToCompressedJSON("{\"test1\" : {\n\"test1\" : 111\n}\n}");
        assertEquals("{\"test1\":{\"test1\":111}}", fullJSON.getJSON());
    }

    @Test
    void compression2() {
        fullJSON = new FullToCompressedJSON("{\"test2\":{\"test2\":222}}");
        assertEquals("{\"test2\":{\"test2\":222}}", fullJSON.getJSON());
    }

    @Test
    void NoValidJSON() {
        fullJSON = new FullToCompressedJSON("}\"test3\":}\"test3\":333{{");
        assertEquals(false, fullJSON.isJSONValid(fullJSON.getJSON()));
    }

    @Test
    void ValidJSON() {
        fullJSON = new FullToCompressedJSON("{\"test4\":{\"test4\":444}}");
        assertEquals(true, fullJSON.isJSONValid(fullJSON.getJSON()));
    }
}