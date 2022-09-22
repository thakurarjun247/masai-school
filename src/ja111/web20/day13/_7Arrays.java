package ja111.web20.day13;
import java.util.*;
public class _7Arrays {
    //ArrayList, Set, LL, Q, Stack
    public static void main(String[] args) {
        int[] a={4,2,3,6,7,1};
        Arrays.sort(a);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(a));
        List<Integer> integerList=Arrays.asList(4,2,5);

        //searching...
        Arrays.binarySearch(a, 4);
        int[] b=Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(b));


    }
}
