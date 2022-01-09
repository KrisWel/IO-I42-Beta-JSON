package pl.put.poznan.transformer.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressedToFullJSONTest {

    JSONBaseDecorator compressJSON;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void uncompression1() {
        compressJSON = new CompressedToFullJSON("{\"test1\":{\"test1\":111}}");
        assertEquals("{\"test1\" : {\n\"test1\" : 111\n}\n}", compressJSON.getJSON());
    }

    @Test
    void uncompression2() {
        compressJSON = new FullToCompressedJSON("{\"test2\" : {\n\"test2\" : 222\n}\n}");
        assertEquals("{\"test2\" : {\n\"test2\" : 222\n}\n}", compressJSON.getJSON());
    }

    @Test
    void NoValidJSON() {
        compressJSON = new FullToCompressedJSON("}\"test3\":}\"test3\":333{{");
        assertEquals(false, compressJSON.isJSONValid(compressJSON.getJSON()));
    }

    @Test
    void ValidJSON() {
        compressJSON = new FullToCompressedJSON("{\"test4\":{\"test4\":444}}");
        assertEquals(true, compressJSON.isJSONValid(compressJSON.getJSON()));
    }
}