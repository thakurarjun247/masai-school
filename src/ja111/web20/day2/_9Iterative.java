package ja111.web20.day2;

public class _9Iterative {
    public static void main(String[] args) {
        //for
        //do while
        //while
        for (int loopVariable = 0; loopVariable < 5; loopVariable++) {
            System.out.println("for loop");
        }
        int j=0;
        while(j<3)
        {
            System.out.println("while loop");
            j++;
        }
        //do while: runs at least once
        int x=0;

        do{
            System.out.println("something do while");
            x++;
        }
        while (x<2);
    }
}
