package ja111.web20.day13;

import java.util.HashMap;
import java.util.*;

public class _4MapDemo {
    public static void main(String[] args) {
        Map<String, Double > countryToPopulation=new LinkedHashMap<>();
        countryToPopulation.put("India", 1.3 );
        countryToPopulation.put("China", 1.4);
        countryToPopulation.put("TH", .07);
        System.out.println(countryToPopulation);

        //hashMap= unordered
        //LinkedHashMap = ordered
        //Hierarchy Of Map
        /*
        *                       java.util.Map(I)
        *
        * HashMap(c)               SortedMap(I)               HashTable
        *   |                       |
        * LinkedHashMap(c)         TreeMap(c)
        * */


    }
}
