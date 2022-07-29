package sb101.web18.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class _3StreamDemo {
    //Stream API - Java 8
    /*
    * java.util.stream.Stream
    *
    * Features:
    * Items aren't stored in a stream, moving.
    * Stream<Integer>
    * List<Integer> intList=Arrays.asList(1,2,3);
    * Immutablity
    * Streams can only contain wrapper classes, not the primitives
    *
    * (1,2,3,4..........)
    * (2,4,6,8..........)
    *
    * stream() signature
    * public default Stream<T> stream();
    * Stream<Employee>

    * Two types of methods:
    * 1. intermidiate:
    * map
    * filter
    *
    * 2. final
    * forEach
    * collect
    * min
    * max
    *
    * */

    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(1,2,3,4, 5, 6);
        //can be rewritten as
        /*List<Integer> list= new ArrayList<>();
        list.add(1);*/


        //convert a list into a stream
        Stream<Integer> integerStream=intList.stream();
        integerStream.forEach(item -> System.out.println(item));
        //can be rewritten as: it will be covered later
        //foreach returns void

        intList
                .stream()
                .forEach(System.out::println);

        System.out.println("filtering");
        //print only even/odd numbers
        intList
                .stream()
                .filter(item -> (item%2 == 0))
                .forEach(item -> System.out.println(item));
    }

}


