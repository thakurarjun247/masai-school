package ja111.web20.day2;



public class _10Break {
    public static void main(String[] args) {
        //break will take you out the current code block of a loop or a switch-case
        for (int i = 0; i < 50; i++) {
            System.out.println("break demo");
            if(i==2)
                break;

        }
        for (int outer = 0; outer < 5; outer++) {
            System.out.println("outer "+outer);
            for (int inner = 0; inner <2 ; inner++) {

                if (inner==1)
                    break;

                System.out.println("inner "+inner);
            }
        }

        while(true){
           System.out.println("this is reachable");
            break;
            //unreachable
            //System.out.println("this is not");
        }
        System.out.println("out of while loop");
    }

}
