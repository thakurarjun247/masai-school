package ja111.web20z.day8;

import java.util.*;

public class _5LinkedHashSet {
    public static void main(String[] args) {
        //Hashset doesn't preserve order of insertion
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        hs.add("Delhi"); //duplicate element
        hs.add(null); //adding null
        hs.add("Bangaluru");
        System.out.println(hs);
        //preserves the order of insertion.
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

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
