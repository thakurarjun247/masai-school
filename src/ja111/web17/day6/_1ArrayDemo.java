package ja111.web17.day6;

import java.util.Arrays;

public class _1ArrayDemo {
    public static void main(String[] args) {
        //declare
        // <datatype>[] arrayName
        int[] marks;

        //declare and initialize.
        // arrayName=new <datatype>[size]
        marks=new int[100];

        //clubbing declaration and init.
        boolean[] boolArray=new boolean[23]; //index: 0 to 22. length 23

        //another way for declaring + init.
        int[] arrayWithCurliBrackets={0,1,2,3,4};

        System.out.println(boolArray);
        System.out.println(boolArray.length);
        //setting items in the array at a given index:
        boolArray[5]=true;
        //boolArray[7]=2345; CT error
        //get the array values
        System.out.println(boolArray[5]);
        boolArray[6]=false;
        //java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(boolArray[-1]);
        //default values:

        //primitives:
        //int[] : 0
        //boolean[]: false
        System.out.println(boolArray[0]); //false

        //Wrapper Classes: covered later.
        //Integer[] = null
        //Boolean[] = null
        Integer[] a=new Integer[10];
        System.out.println(a[0]); //null


        //Iterating over arrays:
        //first way
        for(int i=0; i<arrayWithCurliBrackets.length;i++){
            System.out.println(arrayWithCurliBrackets[i]);
        }
        //second way:
        for(int itemIsNotAKeyword : arrayWithCurliBrackets){
            System.out.println(itemIsNotAKeyword);
        }
        System.out.println(Arrays.toString(arrayWithCurliBrackets));




    }
}
