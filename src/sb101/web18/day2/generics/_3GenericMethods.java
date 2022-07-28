package sb101.web18.day2.generics;

import java.util.Map;

public class _3GenericMethods {
    //method - print an array
    //DRY
    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4};
        Character[] charArray={'a','b'};
        printArrayGeneric(intArray);//
        printArrayGeneric(charArray);
        Map<String, String> map;

    }
    //E=Integer
    public static <E> void printArrayGeneric(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
    }
    //specialization
    public static void printArray(int[] a){

    }
    public static void printArrayString(String[] a){

    }
}
