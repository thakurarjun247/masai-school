package ja111.web20z.day7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1Collections {
    public static void main(String[] args) {
        //problem with Array
        int[] a=new int[10]; //"one" "two" "Three"
        //1. fixed size
        //stacks, q, LL, al.
        List<Integer> integerList=new ArrayList<>(); //internally it's an array, array of var size
        integerList.add(1);
        integerList.add(2);
        for (int i = 3; i <20 ; i++) {
            integerList.add(i);
        }
        System.out.println(integerList);
        //integerList.add(false);

        //two factors:
        // 1. initial capacity : defuault 16
        // 2. load factor : .75 : When the list is 75% full, it automatically doubles it's size.

        //init cap and size/lengh
        // size => actual no of item present in the list
        integerList.size();
        integerList.toArray();
        integerList.remove(3);
        integerList.contains(20);
        //iterate
        //1.
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        //2.
        for (Integer loopVariableName: integerList
             ) {
            System.out.println(loopVariableName);
        }
        //3.
        integerList
                .forEach(loopVariableName -> System.out.println(loopVariableName));

        Iterator<Integer> integerIterator=integerList.iterator();
        while(integerIterator.hasNext())
            integerIterator.next();

        integerList.clear();
        //List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
        //
        //- List is index-based, it able to arrange all the elements as per indexing.
        //- List is able to allow duplicate elements.
        //- List is following insertion order.
        //- List is able to allow any number of null values.
    }
}
