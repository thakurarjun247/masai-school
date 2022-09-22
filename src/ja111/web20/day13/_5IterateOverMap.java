package ja111.web20.day13;

import java.util.*;

public class _5IterateOverMap {
    //k, v
    //entry = <k,v>
    //  {[<k,v>]   [<k1,v1>]}
    //collection of k,v pair, collection of entries

    public static void main(String[] args) {
        Map<Integer, Integer> map= new HashMap<>();
        map.put(0, 0);
        map.put(1,1);
        map.put(2, 4);
        map.put(3, 9);
        System.out.println(map.get(2));
       // map.clear(); //erase
        //no duplicate keys in a map
        map.put(2,20); //replace
        System.out.println(map.get(100));
        Integer defaultValue=map.getOrDefault(100, -1);


        //iterate
        System.out.println(map);
        //1. keyset
        Set<Integer> keySet=map.keySet();
        for(Integer key: keySet){
            System.out.println(key+"->"+map.get(key));
        }

        //2. entrySet
        Set<Map.Entry<Integer, Integer>> entrySet=map.entrySet();
        for (Map.Entry<Integer, Integer> entry: entrySet)
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }


        //3. lambda
        System.out.println("lambda way");
            map
                    .forEach((k,v)-> System.out.println(k +"->"+ v));
            //4.
        map
                .keySet()
                .forEach(key-> System.out.println(key +"->"+ map.get(key)));
    }
}

//TreeMap sortedmap : comparator
