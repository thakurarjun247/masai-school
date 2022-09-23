package ja111.web20.day14;

import java.util.*;

public class _1Collection {
    public static void main(String[] args) {
        //initial capacity (10), size (variable )
        List<Integer> list= new ArrayList<>(); // dynamic array : variable size
        Object[] objArray=list.toArray();
        list.add(10);
        list.add(11);
        //IC=10  LF=.75
        List<Integer> anotherList= Arrays.asList(0,1,2,3,4,5);  //fixed size list

        list.addAll(anotherList);
        System.out.println(list.contains(3));
        System.out.println(list.containsAll(anotherList));
        list.removeAll(anotherList);
        //very old way
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
            //list: allow dups, allow null,
        //ArrayList: internally it's an array : index based access/read a[5] O(1)
        //DELETE/insert index 3: [-1,0,1,2,3,100,4,5] O(n)
        //LinkedList
        //Lookup, search, access: O(n)
        //insert/delete : the very first item. O(1)

        List<String> linkedList= new LinkedList<>(); //doubly LL
        // 1 <-> 2 <-> 3
        /*Object[] a= new Object[10];
        a[0]=1;*/

        //list vs set
        // allows dups, doesn't
        //index based access, doesn't have it
        list.get(0);
        Set<Integer> set= new HashSet<>();
        set.add(0);
        //set.get(0); //sets don't have index based access.

       //Vector: ignore


    }
}
//Collection: add(), remove(), size, empty, clear(),
//List, Set, ...
//