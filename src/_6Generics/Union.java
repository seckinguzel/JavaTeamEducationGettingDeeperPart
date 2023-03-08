package _6Generics;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static <E> Set<E> union(Set<E> s1, Set<E> s2){ //union of two set but it doesn't write one element twice a time!
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);

        return result;
    }

    /*
    Access modifier, "<E>" provides generic structure. Think "E" like elements, for instance an element of a specific list,
    "Set<E>" is mine return type. I could declare it like Set<String> but
    I've declared generic too "Set<E>" because I want union of String, Integer etc.
    */

    public static <T extends Number> long gather(T value1, T value2){
        return value1.longValue() + value2.intValue();
    }


    public static void main(String[] args){
        Set<String> besiktas = Set.of("Metin Tekin", "Ali Gültiken", "Feyyaz Uçar", "Sergen Yalçın");
        Set<String> turkiye = Set.of("Metin Tekin", "Bülent Korkmaz", "Hasan Şaş", "Tugay Kerimoğlu");

        Set<String> birlesim = union(besiktas, turkiye);

        System.out.println(birlesim);

        System.out.println(gather(2, 3));
    }
}
