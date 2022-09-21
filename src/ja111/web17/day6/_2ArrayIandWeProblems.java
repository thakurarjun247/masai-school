package ja111.web17.day6;

public class _2ArrayIandWeProblems {
    public static void main(String[] args) {

        //I problem
        int[] marks = {10,20,30};
        System.out.println("0 th item is "+marks[0]);
        System.out.println("1 st item is "+marks[1]);
        System.out.println("2nd item is "+marks[2]);


        //we problem
        //compute total and avg
        int[] age={34,56,23,87,90};
        int total=0;// 0+34=34+56=> 90+23=> 113
        double average=0;
        for(int itemInArray: age){
            total+=itemInArray;
        }
        average=total/age.length;
        System.out.println(total+" "+average);

        int[] doubled=doubleTheArrayItems(marks);
        for(int item: doubled)
            System.out.println(item);

    }

    public static int[] doubleTheArrayItems(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]= 2*array[i];
        }
        return array;
    }

}
