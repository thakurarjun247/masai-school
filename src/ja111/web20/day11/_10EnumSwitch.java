package ja111.web20.day11;

public class _10EnumSwitch {
}
class Main{

    enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String args[]){

        Day day=Day.MONDAY;

        switch(day){
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            default:
                System.out.println("other day");
        }
    }
}