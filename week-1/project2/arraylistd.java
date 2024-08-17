import java.util.*;

public class arraylistd {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        System.out.println(list);

        list.remove("banana");

        System.out.println(list);

        System.out.println(list.contains("apple"));
        System.out.println(list.contains("banana"));
    }
}
