package ja111.web20z.day8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _4Set {

    //what?
    //how it works
    //1. Set doesn't allow dups
    //2. It's not index based.
    //3. use it if you have to check if an item exists or not in a list.

   // Set-> HashSet, TreeSet (set preserves ordering, sorted set), LinkedHashSet
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("a");//1
        set.add("b"); //2
        set.add("a"); //2
        set.add(null);
        Object[] array=set.toArray();
        //list.contains(z) TC? (a,b,c.....m)? O(n) true
        //set.contains(z) TC?  (a,b,c.....m)
        set.contains("d");//very important.
        //set.get(0);
        //add returns true if the item is added to the set, returns false otherwise.
        System.out.println(set);
        System.out.println("aasdfasdfasdf".hashCode());
        //10000 Strings, "abc" "xyz"
    }
}
