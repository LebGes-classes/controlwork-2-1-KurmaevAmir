import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomQueueTest {
    @Test
    void testQueue() {
        CustomQueue<String> queue = new CustomQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        assertEquals("1", queue.get());
        assertEquals("1", queue.remove());
        assertEquals("2", queue.get());
        assertEquals("2", queue.remove());
        assertEquals("3", queue.remove());
        assertNull(queue.remove());
    }
}