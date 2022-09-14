package ja111.web20.day8.TwoDArrays;

public class _4InitializeAMatrix {
    public static void main(String[] args) {
        int[] a={2,3};

        //print all the array items using foreach loop
        int[][] m={
                {0,1,2},//0
                {3,4},//1
                {5}
        };

        //number of columns in the ith row will be m[i].length

        System.out.println(m[1][1]);
        //System.out.println(m[1][4]);
    }
}
