package _3CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Elma");
        mySet.add("Armut");
        mySet.add("Çilek");
        mySet.add("Elma"); //To writing same element twice a time doesn't work!

        System.out.println(mySet);

        mySet.remove("Armut");

        System.out.println(mySet);

        System.out.println(mySet.size());
    }
}

