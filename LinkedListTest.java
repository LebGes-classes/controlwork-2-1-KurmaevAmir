import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private CollectionsList<Integer> linkedList;
    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    void addElement() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(3, linkedList.find(2));
    }

    @Test
    void testAddElementAtIndex() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2, 5);
        linkedList.add(0, 3);
        assertEquals(5, linkedList.find(3));
        assertEquals(2, linkedList.find(2));
    }

    @Test
    void remove() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(1);
        assertEquals(3, linkedList.find(1));
        linkedList.remove(0);
        assertEquals(3, linkedList.find(0));
    }

    @Test
    void removeByElement() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.removeByElement(2);
        assertEquals(3, linkedList.find(1));
        linkedList.add(4);
        linkedList.removeByElement(4);
    }

    @Test
    void clear() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.clear();
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.find(0));
    }

    @Test
    void find() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(2, linkedList.find(1));
    }

    @Test
    void findByElement() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        assertEquals(2, linkedList.findByElement(3));
    }
}