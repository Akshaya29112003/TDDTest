import org.example.Main;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testAge(){
        Main m1 = new Main();
        assertTrue(m1.age(18));
        assertFalse(m1.age(16));

        assertEquals(19, m1.add(10, 9));

        assertEquals(1,m1.addItem(2).size());
    }

}
