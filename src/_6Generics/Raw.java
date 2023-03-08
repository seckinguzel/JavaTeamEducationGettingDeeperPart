package _6Generics;

import java.util.ArrayList;
import java.util.List;

public class Raw {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();

        unsafeAdd(strings, Integer.valueOf(3));

        String s = strings.get(0);
    }

    private static void unsafeAdd(List list, Object o){
        list.add(o);
    }
}
