package _3CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Elma");
        myList.add("Armut");
        myList.add("Çilek");

        System.out.println(myList);

        myList.remove(1);

        System.out.println(myList);

        System.out.println(myList.size());
    }
}
