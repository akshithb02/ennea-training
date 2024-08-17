import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class HashSetDemoTest {

    @Test
    public void testAddElements() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        assertEquals(3, set.size());
        assertTrue(set.contains("apple"));
        assertTrue(set.contains("banana"));
        assertTrue(set.contains("orange"));
    }

    @Test
    public void testRemoveElement() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        set.remove("banana");

        assertEquals(2, set.size());
        assertTrue(set.contains("apple"));
        assertTrue(set.contains("orange"));
        assertFalse(set.contains("banana"));
    }

    @Test
    public void testContainsElement() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        assertTrue(set.contains("apple"));
        assertTrue(set.contains("banana"));
        assertTrue(set.contains("orange"));
        assertFalse(set.contains("grape"));
    }
}
