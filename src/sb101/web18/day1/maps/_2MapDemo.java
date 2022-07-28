package sb101.web18.day1.maps;
import java.util.*;

public class _2MapDemo {
    public static void main(String[] args) {
        //k MovieName
        //v rating

        //Map can have null as a key, no dups are allowed.
        List<String> list= new ArrayList<>();
        Map<String, Integer> movieNameToRating=new HashMap<>();
        movieNameToRating.put("RRR", 10);
        movieNameToRating.put("TopGun", 10); //replaced by the next line
        movieNameToRating.put("TopGun", 9);
        System.out.println(movieNameToRating.get("TopGun"));
        System.out.println(movieNameToRating.keySet());
        System.out.println(movieNameToRating.values());
        System.out.println(movieNameToRating);

        //Iterate
        Set<String> keySet=movieNameToRating.keySet();
        for(String key: keySet){
            System.out.println(key+ movieNameToRating.get(key));
        }
        Set<Map.Entry<String, Integer>> entrySet=movieNameToRating.entrySet();
        for (Map.Entry<String, Integer> entry: entrySet){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

        //todo: we will learn the syntax later.

        entrySet
                .forEach(myEntry -> System.out.println(myEntry.getKey()+" ---> "+myEntry.getValue()));





    }
}
