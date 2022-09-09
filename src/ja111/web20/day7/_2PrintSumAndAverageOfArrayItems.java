package ja111.web20.day7;

public class _2PrintSumAndAverageOfArrayItems {
   /* public static void main(String[] args) {
        // 1 to 10
        //should print avg, sum
    }*/
   public static void main(String[] args) {
       Integer[] num = new Integer[10];

       for(int i=0;i<num.length;i++){
           num[i]=i+1;
       }

       int sum=0;

       for(int i=0;i<num.length;i++){
           sum=sum+num[i];
       }

       System.out.println(sum);
       System.out.println((double) sum/num.length);

   }
}
/*
* # You Problem:

Write a non-static method inside class Main,
*  which will take an initialized integer array and return the largest number from the supplied array.
* call this method from the main method of main class by supplying an initialized integer array
* and print the returned result.
*
* int fun(int a){
* }
* int j;
* fun(j);
*
*
*
* int fun(int[] a){
* }
* int[] array=new int[9];
* fun(array);
* */