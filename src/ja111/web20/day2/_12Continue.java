package ja111.web20.day2;

public class _12Continue {
    public static void main(String[] args) {
        //continue will land you here
        for (int i = 0; i < 3; i++) {
            if(i==1){
                continue;
            }
            System.out.println("count "+i);
        }
        //here break will land you
    }

}
