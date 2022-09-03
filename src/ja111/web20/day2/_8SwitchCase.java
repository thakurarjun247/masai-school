package ja111.web20.day2;

public class _8SwitchCase {
    public static void main(String[] args) {

        int i = 1000;

        switch (i) {
            case 5:
                System.out.println("Five");
                break;
            case 10:
                System.out.println("Ten");
                break;
            case 15:
                System.out.println("Fifteen");
                break;
            case 20:
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Default");
                break;
        }
        //break will send you out of the switch block. here.
    }
}
