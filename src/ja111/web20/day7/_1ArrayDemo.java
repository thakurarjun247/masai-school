package ja111.web20.day7;

import java.util.Arrays;

public class _1ArrayDemo {
    public static void main(String[] args) {
        //syntax: Declaration
        //<datatype>[] <array_name>

        int[] ages; //[0,1,2....]

        //syntax for creating
        //new <DataType>[size]
        ages=new int[10];

        //another way
        String[] names=new String[10];
        System.out.println(ages);
        Integer[] integers=new Integer[5];
        for(Integer i:integers)
            System.out.println(i);
        //accessing array item at index 0 in JS
        integers[0]=10;
        System.out.println(integers[0]);
        for (int i = 0; i < integers.length; i++) {
            integers[i]=i;
            System.out.println(integers[i]);
        }
        //when (not) to use array?
        //  1. you know the number of items
        //  2. same data types
        //  3.
        //another way:
        String[] array={"one", "two", "three"};
        //System.out.println(array[-1]);
        //iterating over an array:
        //for, while

        //sytax
        /*
        * for(<data_type> loop_variable : name_of_array){
        * sout(loop_variable);
        * }
        * */
        for(String nameCanBeAnything: array){
            System.out.println(nameCanBeAnything);
        }

        //you don't need to remember
        Arrays
                .stream(array)
                .forEach(item-> System.out.println(item));

    }
}
