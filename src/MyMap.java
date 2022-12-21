import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static Map<String, Integer> myMap = new HashMap<>();


    public static void putToMap(String key, Integer value) {
        if (myMap.containsKey(key) && myMap.get(key).equals(value)) {
            throw new IllegalArgumentException("В коллекции уже есть такой элемент");
        } else myMap.put(key, value);
    }


}
