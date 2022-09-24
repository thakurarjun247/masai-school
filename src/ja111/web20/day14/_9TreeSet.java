package ja111.web20.day14;

import java.util.*;

public class _9TreeSet {
    public static void main(String[] args) {
        Set<String> ts= new TreeSet<>(); //sorted set
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Chennai");
        ts.add("Bangaluru");
        System.out.println(ts);


        Plant snakePlant= new Plant(12, "DarkGreen");
        Plant moneyPlant = new Plant(50, "Green");
        Plant anotherPlant = new Plant(52, "Red");

        Set<Plant> plantTreeSet= new TreeSet<>();
        plantTreeSet.add(anotherPlant);
        plantTreeSet.add(snakePlant);
        plantTreeSet.add(moneyPlant);


        System.out.println(plantTreeSet);

        //comparator:



    }
}
