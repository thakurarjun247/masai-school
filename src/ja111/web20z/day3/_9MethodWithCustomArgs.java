package ja111.web20z.day3;

public class _9MethodWithCustomArgs {
    //takes an egg as an argument
    static void printEggDetails(Egg egg){
        System.out.println(egg.color+" "+egg.size);
    }

    //method that returns an egg object as the return type?
    public Egg eggDetails(Egg egg){
        return egg;
    }
    Egg eggMethod(String color, int size) {
        Egg e1 = new Egg();
        e1.color = color;
        e1.size = size;
        return e1;
    }

    static Egg createEgg(){
        Egg egg=new Egg();
        return egg;
    }


    public static void main(String[] args) {
        Egg egg= new Egg();
        egg.size=10;
        egg.color="white";

        printEggDetails(egg);
        Egg emptyEgg=new Egg();
        printEggDetails(emptyEgg);
        Egg eggCreated=createEgg();
        printEggDetails(eggCreated);
    }
}
