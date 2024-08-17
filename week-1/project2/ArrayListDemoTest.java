import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ArrayListDemoTest {

    @Test
    public void testAddElement() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        assertEquals(3, list.size());
        assertTrue(list.contains("apple"));
        assertTrue(list.contains("banana"));
        assertTrue(list.contains("orange"));
    }

    @Test
    public void testRemoveElement() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        list.remove("banana");

        assertEquals(2, list.size());
        assertTrue(list.contains("apple"));
        assertFalse(list.contains("banana"));
        assertTrue(list.contains("orange"));
    }

    @Test
    public void testContainsElement() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        assertTrue(list.contains("apple"));
        assertFalse(list.contains("grape"));
    }
}
