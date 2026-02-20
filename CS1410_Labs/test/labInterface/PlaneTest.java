package labInterface;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for Plane class.
 */
public class PlaneTest
{
    @Test
    public void testToString()
    {
        Plane p = new Plane(4, "Boing 747");
        assertEquals("Boing 747 with 4 engines", p.toString());
    }

    @Test
    public void testLaunch()
    {
        Plane p = new Plane(2, "Test Plane");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        p.launch();

        assertEquals("Rolling until take-off\n", out.toString());
    }

    @Test
    public void testLand()
    {
        Plane p = new Plane(2, "Test Plane");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        p.land();

        assertEquals("Rolling to a stop\n", out.toString());
    }
}