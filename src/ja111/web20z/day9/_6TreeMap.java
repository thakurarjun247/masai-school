package ja111.web20z.day9;

import java.util.*;

public class _6TreeMap {
    public static void main(String[] args) {
        Map<String, String> tm= new TreeMap<>();
        tm.put("Maharastra","Mumbai");
        tm.put("Telangana","Hydrabad");
        tm.put("Tamilnadu","Chennai");
        tm.put("Karnataka","Bangaluru");
        tm.put("Bihar","Patna");

        System.out.println(tm);
    }
}
