package ja111.web20z.day2;

public class _2ConditionalStatements {
    //conditional statements:
    //if,
    // if-else,
    // if, else-if, else-if else
    //nested if else
    public static void main(String[] args) {
        int i=10;
        i++; //11
        int j=0;
        if(i==10){ //11
            j=20;
        }
        else {
            j=30;
        }
        int sum=i+j;
        System.out.println(j);




        //switch case:
        int dayNight=3; // 0 day, 1 night, anything else: wrong input
        switch (dayNight){
            case 0:
                System.out.println("day");
                break;
            case 1:
                System.out.println("night");
                break;
            default:
                System.out.println(" wrong input");
        }


        String name="Ruby";
        //yes you can use String in switch-case.

    }



}
