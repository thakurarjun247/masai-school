package sb101.web18.day2.generics;

import java.util.ArrayList;
import java.util.List;

//type safety
//error detection
public class _1GenericsDemo {

    public static void main(String[] args) {
        //type safety
        //list of int
        //without generics
        List list=new ArrayList();
        list.add(5);
        list.add("5");
       int num= (int) list.get(1);

       List<Integer> integerList=new ArrayList<>();
        integerList.add(5);
       //integerList.add("5");

        //no need to do casting
        //fail fast- compile time error check.




    }
}

//Arraylist without generics
class MyArrayListWithoutGenerics{
    public boolean add(Object object){
        //some code
        return true;
    }

    public Object get(int index){
        return 0;
    }
}


class MyArrayListWithGenerics<T>{
    public boolean add(T t){
        return true;
    }

    public T get(int index){
        T t = null;
        return t;
    }
}