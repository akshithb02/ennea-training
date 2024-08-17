import java.util.*;
class hashmapd{

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "akshith");
         map.put("age", "20");
          map.put("college", "AU");
        System.out.println(map);
            map.remove("college");
        System.out.println(map);
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsKey("college"));
    }
}
