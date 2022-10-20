package ja111.web20z.day9;

import java.util.*;

public class _3HashMap {
    public static void main(String[] args) {
        //java.util.Map(I)           k,v pairs username->email
        // HashMap(c)           SortedMap(I)        HashTable
        //LinkedHashMap(c)      TreeMap(c)

        //Map
        //Entry(k, v)

        Map<Integer, String> hm= new HashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        //dups: replace.
        hm.put(2, "new value");
        hm.get(2);
        System.out.println(hm.getOrDefault(9, "the value isn't present"));;

        hm.forEach((k,v)-> System.out.println(k+" ---> "+v));
        hm.keySet().forEach(k -> hm.get(k));
        for(Map.Entry<Integer, String> entry: hm.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }


    }
}
