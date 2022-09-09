package ja111.web20.day7;

public class _4MaxItemInArray {
    public static void main(String[] args) {
        int[] a={-4, 3,5,2,-1, 0,9};
        System.out.println(getMaximumItemFromArray(a));
    }
    static int getMaximumItemFromArray(int[] array){
        int maxValueInMyArray=Integer.MIN_VALUE;
        if(array.length==0)
        {
            System.out.println("array is empty");
            //throw NoSuchElementException("empty array");
            return maxValueInMyArray;
        }

        for(int i =0;i<array.length;i++){
            if(array[i]>maxValueInMyArray)
                maxValueInMyArray=array[i];
        }
        return maxValueInMyArray;
    }
}
