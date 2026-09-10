package tw.edu.nptu.oop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EnvCheckTest {
    @Test
    void messageUsesName() {
        assertEquals("Hello, NPTU!", EnvCheck.message("NPTU"));
    }

    @Test
    void blankUsesDefaultMessage() {
        assertEquals("Hello, Java OOP!", EnvCheck.message(" "));
    }
}