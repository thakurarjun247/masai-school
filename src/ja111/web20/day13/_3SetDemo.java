package ja111.web20.day13;

import java.util.HashSet;
import java.util.Set;

public class _3SetDemo {
    //set Integer:{2,5,3,1}
        //may or may not be ordered
        //doesn't have dups
    //when to use set in Java
        //if size of the ds is unknown
        //there are no dups
    public static void main(String[] args) {
        //intial capacity: 16 items
        //load factor: .75
        //size: no. of items that are present in the set.

        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.size();
        set.add(2);
        set.size();
        System.out.println("end");
        set.remove(1);
        set.contains(2);
        set.isEmpty();
        for (int i=0;i<15;i++){
            set.add(i);
        }
       set.forEach(item -> System.out.println(item));

    }
}
