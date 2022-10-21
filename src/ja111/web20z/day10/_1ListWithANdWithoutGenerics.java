package ja111.web20z.day10;

import java.util.ArrayList;
import java.util.List;

public class _1ListWithANdWithoutGenerics {
    public static void main(String[] args) {
        List strings= new ArrayList(); //Object
        strings.add("a");
        strings.get(1);


        List<String> stringList= new ArrayList(); //Object
        stringList.add("a");
        stringList.get(1);
    }
    //Without Generic
    public boolean add(Object o){ //Object is general type
        return true;
    }
    Object get(int index){
        return new Object();
    }

    //With Generic
  /*  public boolean add(T o){
        return true;
    }
    T get(int index){
        return new Object();
    }*/
}
