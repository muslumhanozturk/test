import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanityCheckTest {
    @Test
    void shouldReturnPass() {
        SanityCheck sanityCheck = new SanityCheck();

        String actual = sanityCheck.test();

        assertEquals("PASS", actual);
    }
}