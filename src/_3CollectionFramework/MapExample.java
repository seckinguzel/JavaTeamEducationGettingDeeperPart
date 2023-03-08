package _3CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("Elma", 1);
        myMap.put("Armut", 2);
        myMap.put("Çilek", 3);

        System.out.println(myMap);

        System.out.println(myMap.get("Elma"));


        System.out.println(myMap.containsKey("Armut")); //To check existence of a key.

        myMap.remove("Çilek");

        System.out.println(myMap);

        System.out.println(myMap.size()); // 2
    }
}

