package ja111.web20z.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6LowerBounds {
    //List<? super Integer>
    public static void addNumbers(List<? super Integer> list) {

        for(Object n:list)
        {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        addNumbers(list);
        List<Number> l2=Arrays.asList(1.0,2.0,3.0);
        System.out.println("displaying the Number values");
        addNumbers(l2);

        List<String> l3=Arrays.asList("asd", "asd");
        //addNumbers(l3);
        List<Object> objects=new ArrayList<>();
        addNumbers(objects);
    }
}
