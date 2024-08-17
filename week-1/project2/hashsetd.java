import java.util.*;
public class hashsetd {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");

        System.out.println(set);

        set.remove("banana");

        System.out.println(set);

        System.out.println(set.contains("apple"));
        System.out.println(set.contains("banana"));
    }
}
