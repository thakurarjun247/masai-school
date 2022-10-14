package ja111.web20z.day5;

public class _6ArrayWeProblem {
    //Compute Sum and Average of Array Elements
    //int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum=0;
        for(Integer item : numbers){
            sum+=item;

        }
        System.out.println(sum);
        System.out.println(sum/numbers.length);
    }
    //you
    //Write a non-static method inside class Main, which will take an initialized integer array and return the largest number from the supplied array.
    // call this method from the main method of main class by
    // supplying an initialized integer array and print the returned result.
}
