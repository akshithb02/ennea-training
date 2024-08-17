import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class HashMapDTest {

    @Test
    public void testAddEntries() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "akshith");
        map.put("age", "20");
        map.put("college", "AU");

        assertEquals(3, map.size());
        assertEquals("akshith", map.get("name"));
        assertEquals("20", map.get("age"));
        assertEquals("AU", map.get("college"));
    }

    @Test
    public void testRemoveEntry() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "akshith");
        map.put("age", "20");
        map.put("college", "AU");

        map.remove("college");

        assertEquals(2, map.size());
        assertTrue(map.containsKey("name"));
        assertTrue(map.containsKey("age"));
        assertFalse(map.containsKey("college"));
    }

    @Test
    public void testContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "akshith");
        map.put("age", "20");

        assertTrue(map.containsKey("name"));
        assertTrue(map.containsKey("age"));
        assertFalse(map.containsKey("college"));
    }
}
