import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {
    Shape shape;
    Drawing drawing;

    @BeforeEach
    void setUp() {
        drawing = new Drawing();
    }

    @Test
    void testOctagon() {
        System.out.println("Running: testOctagon");

        shape = new Octagon();
        drawing.add(shape);

        assertEquals(drawing.clear(), "All shapes were cleared");
    }

    @Test
    void testPentagon() {
        System.out.println("Running: testPentagon");

        shape = new Pentagon();
        drawing.add(shape);

        assertEquals(drawing.clear(), "All shapes were cleared");
    }
}
