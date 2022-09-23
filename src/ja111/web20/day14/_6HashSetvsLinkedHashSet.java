package ja111.web20.day14;

import java.util.*;

public class _6HashSetvsLinkedHashSet {
    public static void main(String[] args) {
        Set<String> hs= new HashSet<>();
        Set<String> lhs= new LinkedHashSet<>(); //child of hs: preserves the order of items.

        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        hs.add("Delhi"); //duplicate element
        hs.add(null); //adding null
        hs.add("Bangaluru");

        System.out.println(hs);

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Pune");
        lhs.add("Delhi"); //duplicate element
        lhs.add(null); //adding null
        lhs.add("Bangaluru");

        System.out.println(lhs);



    }
}
