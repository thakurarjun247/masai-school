package ja111.web20z.day5;

import java.util.Arrays;

public class _7TakeandReturnArrayInAMethod {
    public static void main(String[] args) {
        Double[] array={15.0, 2.5, 3.0};
        Double[] outPutArray=doubleTheArray(array);
        System.out.println(outPutArray[1]);

        Double[] copyOfArray=Arrays.copyOf(array, 3);
        Arrays.sort(array);
        //print array
        System.out.println(Arrays.toString(array));

    }
    static Double[] doubleTheArray(Double[] array){ //1.5, 2.5, 3
        //you create another array
        Double[] newArray=new Double[array.length];
        //double of the current array
        for(int i=0;i< array.length;i++)
        {
           newArray[i]=array[i]*2;
        }
        //return the new array.
        //3.0, 5.0
        return newArray;
    }
}
