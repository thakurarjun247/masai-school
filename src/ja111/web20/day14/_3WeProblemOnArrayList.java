package ja111.web20.day14;

import java.util.*;

public class _3WeProblemOnArrayList {
    //create a few plant objects
    //add them to a list: Arraylist
    //print all the plant color and name
    public static void main(String[] args) {
        Plant snakePlant= new Plant(12, "DarkGreen");
        Plant dressina = new Plant(50, "Green");
        List<Plant> plantList= new ArrayList<>();
        plantList.add(snakePlant);
        plantList.add(dressina);
        plantList.forEach(plant -> System.out.println(plant));
    }

}
