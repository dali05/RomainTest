

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


class RomainTest {


    @Test
    void arabToRomain() {

        String result = Romain.ArabToRomain(5);
        assertEquals(result, "V");
    }
}