package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HarmonicTest {

    private final double DELTA = 1e-9; // one billionth

    @Test
    void harmonic_positiveN() {
        // Harmonic(3) = 1 + 1/2 + 1/3 = 1.8333...
        assertEquals(1.833333333, Recursion.harmonic(3), DELTA);
    }

    @Test
    void harmonic_negativeN() {
        // Harmonic(-3) = -(1 + 1/2 + 1/3) = -1.8333...
        assertEquals(-1.833333333, Recursion.harmonic(-3), DELTA);
    }

    @Test
    void harmonic_zeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Recursion.harmonic(0);
        });
    }
}
