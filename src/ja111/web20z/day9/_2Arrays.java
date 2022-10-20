package ja111.web20z.day9;
import java.util.Arrays;
import java.util.List;

public class _2Arrays {
    public static void main(String[] args) {
        int[] a={5,2,7,4,9,1};
        int[] b={50,2,7,4,9,10};
        int[] c= new int[10];
        System.out.println(Arrays.toString(a));;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println( Arrays.binarySearch(a, 7));
        System.out.println(Arrays.equals(a,b));
        Arrays.fill(c, 100);
        b=Arrays.copyOf(a,6);
        System.out.println(Arrays.toString(b));
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7); //fixed size one
    }
}
