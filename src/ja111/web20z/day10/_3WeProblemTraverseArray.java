package ja111.web20z.day10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _3WeProblemTraverseArray {
    //dont' use primitives,
    //always use Wrapper classes for Generics.



    public static void main(String[] args) {
        Collection c;
        String[] strings={"one", "two"};
        Integer[] integers= {2,3,4,5};
        traverse(strings);
        traverse(integers);
    }
    static <E> void traverse(E[] array){
       // print all the array items
        for(E element:array)
            System.out.println(element);
    }

}

//write a method traverse(array){print all the array items}
