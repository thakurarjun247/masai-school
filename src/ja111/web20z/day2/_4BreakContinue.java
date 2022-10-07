package ja111.web20z.day2;

public class _4BreakContinue {
    //stop for loop using break?
    //continue: skipping, ignoring

    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            if(i==3)
                continue;
            //skip the remaining of the for loop body.
            System.out.println(i);
        }
    }
}
